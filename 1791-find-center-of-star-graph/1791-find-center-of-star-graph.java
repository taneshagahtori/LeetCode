class Solution {
    public int findCenter(int[][] edges) {
        int edgeOne = edges[0][0];
        int edgeTwo = edges[0][1];
        
        if(edgeOne == edges[1][0] || edgeOne == edges[1][1])
            return edgeOne;
        else
            return edgeTwo;
    }
}