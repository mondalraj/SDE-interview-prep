 public class BuildTree{

    static class Node {
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

    // PreOrder Traversal: root -> left subtree -> right subtree TC: O(n)
    public static void PreOrderTraversal(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    // InOrder Traversal: left subtree -> root -> right subtree TC: O(n)
    public static void InOrderTraversal(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
    }

    // PostOrder Traversal: left subtree -> right subtree -> root TC: O(n)
    public static void PostOrderTraversal(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // LevelOrder Traversal: TC: O(n)

    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Root Node is " + root.data);

        System.out.println("PreOrder Traversal:");
        PreOrderTraversal(root);

        System.out.println("\nInOrder Traversal:"); 
        InOrderTraversal(root);

        System.out.println("\nPostOrder Traversal:"); 
        PostOrderTraversal(root);
    }
}