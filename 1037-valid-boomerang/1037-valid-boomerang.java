class Solution {
    public boolean isBoomerang(int[][] points) {
        if(points.length <3){
            return false;
        }
        int x1= points[0][0];
        int y1=points[0][1];
        int x2=points[1][0];
        int y2=points[1][1];
        for(int i=2; i<points.length; i++){
            int x3=points[i][0];
            int y3=points[i][1];
            if((y1-y2)*(x3-x2)==(x1-x2)*(y3-y2)){
                return false;
            }
        }
        return true;
    }
}