class Solution {
    /**
     * @param {number[]} gas
     * @param {number[]} cost
     * @return {number}
     */
    canCompleteCircuit(gas, cost) {
        let gasSum = gas.reduce((acc,e)=>acc+e,0)
        let costSum = cost.reduce((acc,e)=>acc+e,0)
        if( gasSum < costSum){
           return -1
        }
        let total = 0
        let startIndex = 0
        for(let i = 0;i<gas.length;i++){
            let cur=gas[i]-cost[i]
            total+=cur
            if(total < 0){
                total = 0
                startIndex = i+1
            }
        }
        return startIndex
    }
}
