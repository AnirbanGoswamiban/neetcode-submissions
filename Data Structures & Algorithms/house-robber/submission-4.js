class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        let memo = {}
        let maxValue = -Number.MAX_SAFE_INTEGER
        function recursive(index,value){
            if(index >= nums.length){
                maxValue = Math.max(maxValue,value)
                return
            }
            const memoKey = `${index}-${value}`;
            if(memo[memoKey] !== undefined){
                return 
            }
            recursive(index+2,value+nums[index])
            recursive(index+1,value)
            memo[memoKey] = maxValue
        }
        recursive(0,0)
        return maxValue
    }
}
