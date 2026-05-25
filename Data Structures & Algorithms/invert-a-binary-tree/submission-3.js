/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {TreeNode}
     */
    invertTree(root) {
        function backtrack(node){
            if(node === null){
                return
            }
            // if((node.left === null ) || (node.right === null)){
            //     return
            // }
            let temp = node.left
            node.left = node.right
            node.right = temp
            backtrack(node.left)
            backtrack(node.right)
        }
        backtrack(root)
        return root
    }
}
