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
    public TreeNode findInsertNode(TreeNode root,TreeNode prevroot,int target){
        if(root==null){
            return prevroot;
        }
        if(target<root.val){
            return findInsertNode(root.left,root,target);
        }
        return findInsertNode(root.right,root,target);
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        TreeNode curRoot=findInsertNode(root,null,val);
        if(curRoot==null){
            root=newNode;
            return root;
        }
    if (val < curRoot.val) {
        curRoot.left = newNode;    
    } else {
        curRoot.right = newNode;   
    }
        return root;
        
    }
}