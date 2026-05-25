/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} l1
     * @param {ListNode} l2
     * @return {ListNode}
     */
    addTwoNumbers(l1, l2) {
        let dummy = new ListNode()
        let temp = dummy
        let carry = 0
        let res = []
        while(l1 || l2){
            let num1 = 0
            let num2 = 0
            if(l1){
             num1 = l1.val
            l1=l1.next
            }
            if(l2){
             num2 = l2.val
            l2=l2.next
            }
            let sum = carry+num1+num2
             carry = Math.floor(sum/10)
            let num = Math.floor(sum%10)
            res.push(num)
            let node = new ListNode(num)
            temp.next = node
            temp = temp.next
        }
        console.log(res)
        if(carry > 0){
            let node = new ListNode(carry)
            temp.next=node
        }
        return dummy.next
    }
}
