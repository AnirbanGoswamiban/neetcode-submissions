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
    public void bfs(TreeNode root,List<List<Integer>> res){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            // TreeNode temp=q.poll();
            List<Integer> cur=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            cur.add(temp.val);
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
            }
            res.add(cur);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        bfs(root,res);
        return res;
    }
}
