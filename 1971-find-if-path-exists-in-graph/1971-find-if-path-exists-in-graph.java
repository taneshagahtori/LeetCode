class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        // Perform DFS
        boolean[] visited = new boolean[n];
        return dfs(adjList, source, destination, visited);
    }
    
    private boolean dfs(List<List<Integer>> adjList, int curr, int destination, boolean[] visited) {
        if (curr == destination) {
            return true;
        }
        visited[curr] = true;
        for (int neighbor : adjList.get(curr)) {
            if (!visited[neighbor]) {
                if (dfs(adjList, neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
