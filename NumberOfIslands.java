Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

  ---code----
  class Solution{
    public int numOfIslands(char[][] grid){
      if(grid==null||grid.length==0||grid[0].length==0){
        return 0;}
      int count=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
          if(grid[i][j]=='1'){
            dfs(grid,i,j);
            count++;
          }
        }
        return count;
      }
      public void dfs(char[][]grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]!='1'){
          return;}
        grid[i][j]=='0';
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
      }
    }
