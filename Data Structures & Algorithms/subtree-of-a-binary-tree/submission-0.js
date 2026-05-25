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
     * @param {TreeNode} subRoot
     * @return {boolean}
     */
    isSubtree(root, subRoot) {

     function sametree(p,q){
        if((p===null) && (q===null)){
            return true
        }
        if(((p===null)&&(q!==null))|| ((p!==null)&&(q===null))){
            return false
        }
        if(p.val !== q.val){
            return false
        }
        return sametree(p.left,q.left) && sametree(p.right,q.right)
    }
     function backtrack(node){
        if(node===null){
            return false
        }
        if(sametree(node,subRoot)){
            return true
        }
        return backtrack(node.left) || backtrack(node.right)
     }
     return backtrack(root)
    }
}
