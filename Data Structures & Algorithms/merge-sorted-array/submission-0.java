class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // last index for nums1
        int k=m-1;
        n=n-1;
        int j=nums1.length-1;
        while(k>=0 && n>=0){
            if(nums1[k]>nums2[n]){
                nums1[j]=nums1[k];
                nums1[k]=0;
                k-=1;
            }else{
                nums1[j]=nums2[n];
                n-=1;
            }
            j-=1;
        }
        while(n>=0){
            nums1[j]=nums2[n];
            n-=1;
            j-=1;
        }
    }
}