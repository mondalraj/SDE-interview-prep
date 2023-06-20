public class PrintRangeInBST {
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

    public static void PrintInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (x <= root.data && y >= root.data) {
            PrintInRange(root.left, x, y);
            System.out.print(root.data + " ");
            PrintInRange(root.right, x, y);
        } else if (y <= root.data) {
            PrintInRange(root.left, x, y);
        } else {
            PrintInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 10, 12, 56, 9, 4, 2, 7 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BuildBST(root, values[i]);
        }

        InorderTraversal(root);
        System.out.println(" ");

        PrintInRange(root, 4, 15);
    }
}
