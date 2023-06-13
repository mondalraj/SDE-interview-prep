// We are applying recursion to first find the number of left nodes, no. of right nodes and then return leftNodeCount + rightNodeCount + 1(for root)

public class CountNodes{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data  = data;
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

    public static int CountOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSubTreeCount = CountOfNodes(root.left);
        int rightSubTreeCount = CountOfNodes(root.right);

        return leftSubTreeCount + rightSubTreeCount + 1;
    }

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(root.data);

        int countOfNodes = CountOfNodes(root);
        System.out.println("Count of Nodes: " + countOfNodes);
    }
}