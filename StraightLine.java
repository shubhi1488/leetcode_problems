/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 

 

Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

*/
#code-
  class Solutin{
    public boolean checkStraightLine(int[][] coordinates){
      if(coordinates.length==1) return true;
      int x=coordinates[1][0]-coordinates[0][0];
      int y=coordinates[1][1]-coordinates[0][1];
      for(int i=2;i<coordinates.length;i++){
        int x2=coordinates[i][0]-coordinates[i-1][0];
        int y2=coordinates[i][1]-coordinates[i-1][1];
        if(x2*y!=y2*x){
          return false;}
      }
      return true;
    }
  }
