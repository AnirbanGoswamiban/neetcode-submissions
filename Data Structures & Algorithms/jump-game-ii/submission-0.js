class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    jump(nums) {
        let minJump = Number.MAX_SAFE_INTEGER
        function jumps(index,count){
            if(index === nums.length-1){
                minJump = Math.min(minJump,count)
                return
            }
            let farthest = Math.min(nums[index]+index,nums.length-1)
            for(let i = farthest;i>index;i--){
                    jumps(i,count+1)
            }
            return
        }
        jumps(0,0)
        return minJump
    }
}
