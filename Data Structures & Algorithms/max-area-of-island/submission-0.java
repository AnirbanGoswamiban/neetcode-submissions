class Solution {
    public int dfs(int[][] grid,HashSet<String> set,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        if(set.contains(i+","+j)){
            return 0;
        }
        set.add(i+","+j);
        int area=1;
        area+= dfs(grid,set,i+1,j);
        area+=dfs(grid,set,i,j+1);
        area+=dfs(grid,set,i-1,j);
        area+=dfs(grid,set,i,j-1);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        HashSet<String>set=new HashSet<>();
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,set,i,j));
                }
            }
        }
        return maxArea;
    }
}
