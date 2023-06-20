public class DeleteNodeInBST {

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

    public static Node DeleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = DeleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = DeleteNode(root.right, val);
        } else {
            // if the node is found

            // case1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - Two child
            Node inorderSucc = InorderSuccessor(root.right);
            root.data = inorderSucc.data;
            root.right = DeleteNode(root.right, inorderSucc.data);
        }

        return root;
    }

    public static Node InorderSuccessor(Node root) {
        // Find leftmost node

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 10, 9, 4, 2, 7 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = BuildBST(root, values[i]);
        }

        InorderTraversal(root);
        System.out.println(" ");

        root = DeleteNode(root, 5);

        InorderTraversal(root);
    }
}
