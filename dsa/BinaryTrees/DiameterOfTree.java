// Brute Force Approach : O(n^2) -> Find the maximum from (Left Subtree diameter, Right Subtree diameter, (left subtree height + right subtree height + 1))
// Optimized : O(n) -> We will calculate height and diameter of subtrees in a single go


import java.util.*;

public class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
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

    public static int HeightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = HeightOfTree(root.left);
        int rightHeight = HeightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int DiameterOfTree(Node root) {
        if(root == null){
            return 0;
        }

        int diaLeft = DiameterOfTree(root.left);
        int diaRight = DiameterOfTree(root.right);
        int diaNode = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(diaNode, Math.max(diaLeft, diaRight));
    }

    //Optimized soln
    static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo OptimizedDiameterOfTree(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = OptimizedDiameterOfTree(root.left);
        TreeInfo right = OptimizedDiameterOfTree(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int diaLeft = left.diameter;
        int diaRight = right.diameter;
        int diaNode = left.height + right.height + 1;

        return new TreeInfo(height, Math.max(diaNode, Math.max(diaLeft, diaRight)));
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(nodes);
        
        TreeInfo treeData = OptimizedDiameterOfTree(root);

        System.out.println(treeData.diameter);
    }
}