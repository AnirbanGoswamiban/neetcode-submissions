class Solution {
    /**
     * @param {number[]} cost
     * @return {number}
     */
    minCostClimbingStairs(cost) {
        // if(cost.length === 1){
        //     return cost[0]
        // }
        // let dp = new Array(cost.length+1).fill(0)
        // for(let i = 2;i<dp.length;i++){
        //     dp[i] = Math.min((dp[i-1]+cost[i-1]),(dp[i-2]+cost[i-2]))
        // }
        // return dp[cost.length]


        let minCost = Number.MAX_SAFE_INTEGER

        function backtrack(index,totalCost){
            if(index>=cost.length){
                minCost = Math.min(minCost,totalCost)
                return 
            }
            backtrack(index+1,totalCost+cost[index])
            backtrack(index+2,totalCost+cost[index])
        }
        backtrack(0,0)
        backtrack(1,0)
        return minCost
    }
}
