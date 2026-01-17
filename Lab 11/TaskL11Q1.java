import java.util.*;

public class TaskL11Q1 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        // Step 1: Build the graph using adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Step 2: Perform BFS or DFS to check connectivity
        return bfs(graph, source, destination);
    }

    // BFS implementation
    private boolean bfs(Map<Integer, List<Integer>> graph, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination) return true;

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }

    // Optional DFS implementation
    private boolean dfs(Map<Integer, List<Integer>> graph, int source, int destination, Set<Integer> visited) {
        if (source == destination) return true;
        visited.add(source);

        for (int neighbor : graph.get(source)) {
            if (!visited.contains(neighbor) && dfs(graph, neighbor, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TaskL11Q1 finder = new TaskL11Q1();
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 0;
        int destination = 5;
        System.out.println(finder.validPath(n, edges, source, destination)); // Output: false
    }
}
