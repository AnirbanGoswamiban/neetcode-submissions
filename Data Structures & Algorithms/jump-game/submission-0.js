class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    canJump(nums) {
        let rt = nums.length-1
        // let lt = nums.length-1
        for(let i=nums.length-1;i>=0;i--){
            let lt = i
            if(nums[lt] + lt >= rt){
                rt=lt
                lt-=1
            }
        }
        if(rt === 0){
            return true
        }
        return false
    }
}
