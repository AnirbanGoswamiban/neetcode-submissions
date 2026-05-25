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
    public static void dfs(boolean[] flag,TreeNode p,TreeNode q){
        if( p == null && q==null){
            return;
        }
        if( p == null &&  q!=null){
            flag[0]= false;
            return;
        }
        if( p!=null &&  q==null){
            flag[0]= false;
            return;
        }
        if( p.val !=  q.val){
            flag[0]= false;
            return;
        }
        dfs(flag,p.left,q.left);
        dfs(flag,p.right,q.right);
        return;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] flag={true};
        dfs(flag,p,q);
        return flag[0];
    }
}
