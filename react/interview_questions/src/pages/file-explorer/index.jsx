import {useState} from 'react'
import FolderStructure from './components/FolderStructure'
import explorer from './data/explorer'

export default function FileExplorer() {
  const [explorerData, setExplorerData] = useState(explorer)

  return (
    <main>
      <FolderStructure data={explorerData} setData={setExplorerData} />
    </main>
  )
}
