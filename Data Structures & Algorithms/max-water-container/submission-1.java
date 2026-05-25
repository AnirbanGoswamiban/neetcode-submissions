class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            int length=right-left;
            int height=Math.min(heights[right],heights[left]);
            int Area=height*length;
            maxArea=Math.max(Area,maxArea);
            if(heights[right]>heights[left]){
                left+=1;
            }else if(heights[right]<heights[left]){
                right-=1;
            }else{
                left+=1;
            }
        }
        return maxArea;
    }
}
