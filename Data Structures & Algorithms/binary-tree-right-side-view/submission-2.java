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
    public void bfs(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        Queue<TreeNode>q=new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i =0;i<size;i++){

                TreeNode temp=q.poll();

                if(i==size-1){
                    res.add(temp.val);
                }
                if(temp.left!=null){
                    // q.poll();
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    // q.poll();
                    q.offer(temp.right);
                }
            }
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        bfs(root,res);
        return res;
    }
}
