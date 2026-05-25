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
    public boolean isAncestor(TreeNode root,TreeNode target,List<TreeNode>set){
        if(root==null){
            return false;
        }
        set.add(root);
        if(root.val==target.val){
            return true;
        }
        if(isAncestor(root.left,target,set)){
            return true;
        }
        if(isAncestor(root.right,target,set)){
            return true;
        }
        set.remove(set.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // HashSet<TreeNode>setp=new HashSet<TreeNode>();
        // HashSet<TreeNode>setq=new HashSet<TreeNode>();
        List<TreeNode>setp=new ArrayList<TreeNode>();
        List<TreeNode>setq=new ArrayList<TreeNode>();
        isAncestor(root,q,setq);
        isAncestor(root,p,setp);
        int i=0;
    while (i < setp.size() && i < setq.size() && setp.get(i) == setq.get(i)) {
        i++;
    }
     return setp.get(i - 1);
    }
}
