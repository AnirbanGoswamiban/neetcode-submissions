class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        // let memo = {}
        // let maxValue = -Number.MAX_SAFE_INTEGER
        // function recursive(index,value){
        //     if(index >= nums.length){
        //         maxValue = Math.max(maxValue,value)
        //         return
        //     }
        //     const memoKey = `${index}-${value}`;
        //     if(memo[memoKey] !== undefined){
        //         return 
        //     }
        //     recursive(index+2,value+nums[index])
        //     recursive(index+1,value)
        //     memo[memoKey] = maxValue
        // }
        // recursive(0,0)
        // return maxValue
        if(nums.length === 1) return nums[0]
        let dp = new Array(nums.length).fill(0)

        dp[0] = nums[0]
        dp[1] = Math.max(nums[0],nums[1])

        for(let i = 2 ;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],(dp[i-2]+nums[i]))
        }
        return dp[dp.length-1]


























    }
}
