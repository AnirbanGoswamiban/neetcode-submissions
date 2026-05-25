class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        nums.sort((a, b) => a - b); // Sort the array
        let res = [];

        for (let i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] === nums[i - 1]) continue; // Skip duplicate values for 'i'

            let l = i + 1, h = nums.length - 1;
            let sum = -nums[i];

            while (l < h) {
                let curSum = nums[l] + nums[h];
                if (curSum === sum) {
                    res.push([nums[i], nums[l], nums[h]]);
                    l++;
                    h--;

                    // Skip duplicate values for 'l' and 'h'
                    while (l < h && nums[l] === nums[l - 1]) l++;
                    while (l < h && nums[h] === nums[h + 1]) h--;
                } else if (curSum < sum) {
                    l++;
                } else {
                    h--;
                }
            }
        }

        return res;
    }
}
