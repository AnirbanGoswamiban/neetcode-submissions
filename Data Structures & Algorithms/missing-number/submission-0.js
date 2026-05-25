class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    missingNumber(nums) {
        let map = new Array(nums.length+1).fill(0)
        for(let num of nums){
            map[num] = 1
        }
        for(let i=0;i<map.length;i++){
            if(map[i] === 0){
                return i
            }
        }
    }
}
