import java.util.*;

public class GraphDFS {
    private int vertices;                // number of vertices
    private LinkedList<Integer>[] adj;   // adjacency list

    // Constructor
    public GraphDFS(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src); // remove this line if directed graph
    }

    // DFS utility
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " "); // print current node

        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal starting from a given node
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS starting from node " + start + ":");
        dfsUtil(start, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(7);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        // Perform DFS
        graph.dfs(0);
    }
}
