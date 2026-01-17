// print All Possible Paths Between Two Vertices

import java.util.ArrayList;
import java.util.List;

 class Graph{
       private int v; // Number of vertices
       private ArrayList<Integer>[] adjList; // Array of ArrayList to represent the adjacency list

    // Constructor
    public Graph(int vertices) {
        this.v = vertices;
        adjList = new ArrayList[v]; // Create array of ArrayList of size v

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>(); // Initialize each ArrayList
        }
    }

    //Add an edge
    public void addEdge(int u, int v) {
       adjList[u].add(v); // Add v to u's adjacency list
       }

    // Prints all paths from 's' to 'd'
    public void printAllPaths(int s, int d) {
       boolean[] isVisited = new boolean[v];
       List<Integer> pathList = new ArrayList<>();
       pathList.add(s);
       printAllPathsUtil(s, d, isVisited, pathList);
   }
   // Recursive function to find all paths from u to d
   private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {
       if (u.equals(d)) {
           System.out.println(localPathList);
           return;
       }
       isVisited[u] = true;
        // Recur for all adjacent vertices
        for (Integer i : adjList[u]) {
              if (!isVisited[i]) {
                  localPathList.add(i); // Add the vertex to the path
                  printAllPathsUtil(i, d, isVisited, localPathList);
                  localPathList.remove(localPathList.size() - 1); // Backtrack
              }
          }
  
          isVisited[u] = false; // Mark the current node as unvisited for other paths
      }
}
public class Task5{
       public static void main(String[] args) {
       Graph g = new Graph(4); // Create a graph with 4 vertices

        // Add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);

        int s = 2, d = 3; // Define source and destination vertices
        System.out.println("All paths from " + s + " to " + d + ":");
        g.printAllPaths(s, d);
              
       }
}