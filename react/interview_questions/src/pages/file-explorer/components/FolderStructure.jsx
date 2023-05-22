import {useState} from 'react';

export default function FolderStructure({ data, setData }) {
  const [folderOpened, setFolderOpened] = useState(false);
  const [showInput, setShowInput] = useState({
    visible: false,
    isFolder: false,
  })

  const handleAddNewFileFolder = (e, isFolder) => {
    e.stopPropagation();
    setFolderOpened(true);
    setShowInput({
      visible: true,
      isFolder,
    });
  }

  const handleSaveData = (e) => {
    if(e.keyCode == 13){
      const item = {
        id: Date.now().toString(),
        name: e.target.value,
        isFolder: showInput.isFolder,
        items: [],
      }
      // console.log(item)
      data.items.unshift(item)
      setShowInput({
        visible: false,
        isFolder: false,
      });
      // console.log(data.items)
    }
  }

  return (
    <div>
      {
        data.isFolder ?  
          <div onClick={()=> setFolderOpened((prev) => !prev)} 
            style={{
              cursor: 'pointer',
              backgroundColor: `${folderOpened ? '#bdffcf' : '#ebebeb'}`,
              padding: '5px'
            }}
          >
              📁 {data.name}
            <span style={{paddingLeft: '25px',}}>
              <button 
                onClick={(e) => handleAddNewFileFolder(e, true)}
                >+ Folder</button>
              <button 
                onClick={(e) => handleAddNewFileFolder(e, false)} 
                style={{ marginLeft: '5px' }}>
                + File
              </button>
            </span>
          </div> 
            : 
          <div>📄 {data.name}</div>
      }
     
      {folderOpened &&
        data.isFolder && 
        <>
          {showInput.visible && 
          <div style={{marginLeft: '20px'}}>
            {showInput.isFolder ? '📁 ': '📄 '}
            <input type="text" autoFocus 
              onBlur={(e) => setShowInput((item) => ({
                ...item,
                visible: false,
              }))}
              onKeyDown={(e) => handleSaveData(e)}
            />
          </div>}
          {data.items.map((item) => {
          return <div style={{marginLeft: '20px'}} key={item.id}>
            <FolderStructure data={item} />
          </div>
        })}
        </>
      }
    </div>
  )
}
