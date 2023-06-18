import java.util.*;

public class SumOfNodesAtKthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node BuildTree(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static int sumAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        int index = 1;
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();

        if (k == 1) {
            return root.data;
        }

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode == null) {
                index++;
                if (index > k) {
                    break;
                }
                sum = 0;
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                    continue;
                }
            }
            if (index == k && currentNode != null) {
                sum += currentNode.data;
            }

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(sumAtKthLevel(root, 4));
    }
}