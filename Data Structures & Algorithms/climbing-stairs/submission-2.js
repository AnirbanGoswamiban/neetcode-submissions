class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    climbStairs(n) {
        if(n===2){
            return 2
        }
        let dp = new Array(n+1).fill(1)
        let sum = 2
        for(let i = dp.length-3;i>=0;i--){
            dp[i] = sum
            sum = dp[i]+dp[i+1]
        }
        console.log(dp)
        return dp[0]
    }
}
