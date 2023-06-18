// Time Complexity of inserting a single node - O(h) : h-height of tree

public class BuildBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node BuildBSTree(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = BuildBSTree(root.left, value);
        } else {
            root.right = BuildBSTree(root.right, value);
        }

        return root;
    }

    public static void InOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
    }

    public static boolean SearchInBST(Node root, int key) { // O(h)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return SearchInBST(root.left, key);
        }
        if (key > root.data) {
            return SearchInBST(root.right, key);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BuildBSTree(root, values[i]);
        }

        // System.out.println(root.data);
        // InOrderTraversal(root);
        boolean result = SearchInBST(root, 8);
        System.out.println(result);
    }
}
