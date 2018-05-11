package ds.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFSOnGraph
{

    static class Graph
    {
        private static int V;
        private static LinkedList<Integer> adjList[];

        // constructor
        public Graph(int V)
        {
            this.V = V;
            adjList = new LinkedList[V];

            for (int i = 0; i < V; i++)
            {
                adjList[i] = new LinkedList<>();
            }
        }


        /**
         * add edge adds another vertex to the current one
         * @param source
         * @param destination
         */
        public static void addEdge(int source, int destination)
        {
            adjList[source].add(destination);
        }

        /**
         * dfs method does the depth first search off graph
         * @param v -> is the starting vertex for which we are going to do a dfs for the adjacent vertices
         */
        public static void dfs(int v)
        {
            boolean visited[] = new boolean[V]; // this V (with upper case is the number of vertices in the graph)
            DFSUtil(v, visited);
        }

        private static void DFSUtil(int v, boolean[] visited)
        {

            visited[v] = true;
            System.out.print(v + " "); // visiting a node
            // take out all the adjacent vertices and check whether they are visited or not. if not visit them
            ListIterator<Integer> iterator = adjList[v].listIterator();
            while (iterator.hasNext())
            {
                int n = iterator.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    DFSUtil(n, visited);
                }
            }
        }

        /**
         * Main method to test the DFS of a graph here
         * @param args
         */
        public static void main(String[] args) {

            Graph graph = new Graph(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);
            graph.addEdge(2, 3);
            graph.addEdge(3, 3);

            dfs(2);
        }

    }
}
