public class HeightOfTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;

        public static Node BuildTree(int[] nodes){
            index++;

            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

   public static int HeightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSubTreeHeight = HeightOfTree(root.left);
        int rightSubTreeHeight = HeightOfTree(root.right);

        return Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
   }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        int heightOfTree = HeightOfTree(root);
        System.out.println(heightOfTree);
    }
}