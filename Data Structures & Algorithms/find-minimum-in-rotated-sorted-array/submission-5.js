class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let l = 0
        let h = nums.length-1
        
        while(l <= h){
                        if (nums[l] <= nums[h]) {
                return nums[l];
            }
            let mid = Math.floor(l+((h-l)/2))
            let nextNum = Math.floor((mid+1)%nums.length)
            let prevNum = Math.floor((mid+nums.length-1)%nums.length)
            if(nums[mid] < nums[prevNum] && nums[mid]<nums[nextNum]){
                return nums[mid]
            }
            if(nums[mid] >= nums[l]){
                l=mid+1
            }
            else{
                h=mid-1
            }

        }
        return -1
    }
}
