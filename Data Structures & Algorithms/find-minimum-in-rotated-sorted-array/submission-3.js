class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
findMin(nums) {
        let l = 0;
        let h = nums.length - 1;

        while (l <= h) {
            // If the array is not rotated, the smallest element is the first one
            if (nums[l] <= nums[h]) {
                return nums[l];
            }

            let mid = Math.floor(l + (h - l) / 2);
            let nextNum = (mid + 1) % nums.length;
            let prevNum = (mid + nums.length - 1) % nums.length;

            // Check if the mid element is the minimum
            if (nums[mid] < nums[prevNum] && nums[mid] < nums[nextNum]) {
                return nums[mid];
            }

            // Decide whether to search in the left half or the right half
            if (nums[mid] >= nums[l]) {
                // Minimum must be in the right half
                l = mid + 1;
            } else {
                // Minimum must be in the left half
                h = mid - 1;
            }
        }

        return -1; // This return will never be reached for a valid rotated sorted array
    }

}
