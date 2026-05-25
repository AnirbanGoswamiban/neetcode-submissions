/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteTNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteTNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteTNode(root.right, key);
        } else {
            // Found node
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Two children → find inorder successor
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteTNode(root.right, successor.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteTNode(root,key);
        // return root;

    
}
}