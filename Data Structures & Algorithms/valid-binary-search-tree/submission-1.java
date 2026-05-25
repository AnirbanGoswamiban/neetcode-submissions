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
        private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        // if(root==null){
        //     return true;
        // }
        // if((root.left==null&&root.right!=null) || (root.right==null && root.left!=null))return false;
        // if(root.left==null&&root.right==null)return true;
        // if(root.left.val<root.right.val){
        //     if(root.val>root.left.val){
        //         return true;
        //     }
        // }else{
        //     return false;
        // }
        // boolean v1= isValidBST(root.left);
        // boolean v2= isValidBST(root.right);
        // if(v1 && v2){
        //     return true;
        // }
        // return false;
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
