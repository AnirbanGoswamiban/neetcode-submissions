class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let l=0
        let h=nums.length-1
        while(l<=h){
            if(nums[l] <= nums[h]) {
                return nums[l];
            }
            let mid = l+Math.floor((h-l)/2)
            let next = Math.floor((mid+1)%nums.length)
            let prev = Math.floor((mid+nums.length-1)%nums.length)
            if(nums[mid] < nums[next]  && nums[mid] < nums[prev] ){
                return nums[mid]
            }
            if(nums[mid] >= nums[h]){
                l=mid+1
            }else{
                h=mid-1
            }
            
        }
        return -1
    }
}
