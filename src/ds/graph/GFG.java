package ds.graph;

import java.util.LinkedList;

/**
 * A java program to demonstrate adjacency list
 * representation of graph
 */
public class GFG {

    // an user defined class to represent a graph
    // A graph is an array of adjacency list
    // size of the array would be V (V is the number of vertices)


    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        // constructor
        public Graph(int V) {
            this.V = V;
            // define the size of the array as number of vertices
            adjListArray = new LinkedList[V];
            // define the size of the array as number of vertices which is V, such that the
            // adjacent nodes can be stored
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }


    /**
     * Adds an edge to an undirected graph
     * @param graph -> the underneath graph
     * @param src -> source node
     * @param dest -> destination node
     */
    static void addEdge(Graph graph, int src, int dest) {
        //add an edge from source to destination
        graph.adjListArray[src].addFirst(dest);

        // since this is an undirected graph, hence we need to add another edge with destination to source
        graph.adjListArray[dest].addFirst(src);
    }

    /**
     * An utility method to print the nodes of the graph
     * @param graph
     */
    static void printGraph(Graph graph) {
        for (int v = 0; v < graph.V; v++) {
            System.out.println("Adjacency list of vertex = " + v);
            System.out.print("head");
            for (Integer pCrawl: graph.adjListArray[v]) {
                System.out.println(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }

    /**
     * Test above graph representations
     * @param args
     */
    public static void main(String[] args) {

        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list
        printGraph(graph);
    }
}
