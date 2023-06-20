import java.util.ArrayList;

public class PrintRoot2Leaf {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node BuildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = BuildBST(root.left, val);
        }

        if (val > root.data) {
            root.right = BuildBST(root.right, val);
        }

        return root;
    }

    public static void InorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data + " ");
        InorderTraversal(root.right);
    }

    public static void PrintPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    public static void PrintRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            PrintPath(path);
        }

        PrintRoot2Leaf(root.left, path);
        PrintRoot2Leaf(root.right, path);

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 10, 12, 56, 9, 4, 2, 7 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BuildBST(root, values[i]);
        }

        InorderTraversal(root);
        System.out.println(" ");
        PrintRoot2Leaf(root, new ArrayList<Integer>());
    }
}
