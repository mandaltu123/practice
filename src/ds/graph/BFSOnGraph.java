package ds.graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class BFSOnGraph
{

    static class Graph
    {
        private int V;
        static private LinkedList<Integer> adjListArray[];


        public Graph(int V)
        {
            this.V = V;

            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }


        /**
         * Adding one direction as this is a directed graph
         * @param src
         * @param dest
         */
        static void addEdge(int src, int dest)
        {
            adjListArray[src].addFirst(dest);
        }

        /**
         * Prints BFS traversal from a given source
         * @param s
         */
        public void bfs(int s)
        {
            // create visited array to point whether a particular node is being visited or not
            boolean visited[] = new boolean[V];
            //create a queue for bfs
            Queue<Integer> queue = new LinkedList<>();

            // mark current node as visited
            visited[s] = true;
            queue.add(s);
            while (!queue.isEmpty()) {
                s = queue.poll();
                System.out.print(s + " ");
                // get all adjacent vertices of the de-queued vertex
                // iterate over them and check in the visited array
                // if not visited, mark visited and add to the  queue

                ListIterator<Integer> integerListIterator = adjListArray[s].listIterator();
                while (integerListIterator.hasNext()) {
                    int n = integerListIterator.next();
                    if(!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }


        // tester method
        public static void main(String[] args) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Following is Breadth First Traversal "+
                    "(starting from vertex 2)");

            g.bfs(2);
        }
    }
}
