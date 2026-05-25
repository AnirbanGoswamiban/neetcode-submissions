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
    private HashMap<TreeNode, Integer> memo = new HashMap<>();
    public int breakin(TreeNode root) {
        if (root == null) {
            return 0;
        }
                if (memo.containsKey(root)) {
            return memo.get(root);
        }

        // Option 1: take this node → skip children, go to grandchildren
        int take = root.val;
        if (root.left != null) {
            take += breakin(root.left.left) + breakin(root.left.right);
        }
        if (root.right != null) {
            take += breakin(root.right.left) + breakin(root.right.right);
        }

        // Option 2: skip this node → free to rob children
        int skip = breakin(root.left) + breakin(root.right);

         
                int ans = Math.max(skip, take);
        memo.put(root, ans);
        return ans;
    }

    public int rob(TreeNode root) {
        return breakin(root);
    }
}
