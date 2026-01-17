import java.util.ArrayList;

public class Task2{
       static class Edge{
              int source;
              int distance;
              Edge(int source, int distance){
                     this.source=source;
                     this.distance=distance;
              }

       }
       static void createGraph(ArrayList<Edge> graph[]){
              for(int i=0; i<graph.length;i++){
                     graph[i]=new ArrayList<Edge>();
              }
              graph[0].add(new Edge(0, 2));
              graph[1].add(new Edge(1, 2));
              graph[1].add(new Edge(1, 3));

              graph[2].add(new Edge(2, 0));
              graph[2].add(new Edge(2, 1));
              graph[2].add(new Edge(2, 3));

              graph[3].add(new Edge(3, 1));
              graph[3].add(new Edge(3, 2));
              //graph[0].add(new Edge(0, 2));
              

       }
       static void countNodesEdges(ArrayList<Edge> graph[]){
              int edges=0;
              int vertice=0;
              for(int i=0; i<graph.length; i++){
                     vertice++;
                     for(Edge e:graph[i]){
                            edges++;
                     }
                     System.out.println();
              }
              System.out.println("Total vetices in Bidirectional Graph : "+vertice);
              System.out.println("Total Edges  in Bidirectional Graph "+edges);


       }
       public static void main(String[] args) {
              int v=4;
              ArrayList<Edge> graph[]=new ArrayList[v];
              createGraph(graph);
              for(int i=0; i<graph.length; i++){
                     System.out.print("Vertex " + i + " edges: ");
                     for(Edge e:graph[i]){
                            System.out.print("( "+e.source+" -> "+e.distance+" )");

                     }
                     System.out.println();
              }
              countNodesEdges(graph);

       }
}