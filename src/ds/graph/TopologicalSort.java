package ds.graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TopologicalSort {


    static class Graph
    {
        static int V;
        static LinkedList<Integer> adjList[];


        // constructor
        public Graph(int v)
        {
            this.V = v;
            adjList = new LinkedList[V];
            // fill up the array with linked lists
            for (int i = 0; i < V; i++)
            {
                adjList[i] = new LinkedList<>();
            }

        }


        public void addEdge(int source, int destination)
        {
            adjList[source].add(destination);
        }


        public static void topologicalSort()
        {
            // create a statck
            Stack stack = new Stack();
            // create visited array and fill it with false for all indexes to start with
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++)
            {
                visited[i] = false;
            }
            //call the recursive helper method to store the topological sort starting from all vertices one by one
            for (int i = 0; i < V; i++)
            {
                if(!visited[i])
                {
                    topSorUtil(i, visited, stack);
                }
            }

            // At this point the stack will have all the elements visited and pushed in topological order
            while(!stack.isEmpty())
            {
                int element  = (int) stack.pop();
                System.out.print(element + " ");
            }

        }


        /**
         * This is the topological sorting util class where we do the following stuff :
         * 1. we first make the passed node visited
         * 2. Then recur all the adjacent elements of the given list,
         * 3. visit all the elements
         * 4. then push the current element to the stack
         * @param n
         * @param visited
         * @param stack
         */
        private static void topSorUtil(int n, boolean[] visited, Stack stack) {
            // mark the current node as visited
            visited[n] = true;
            Integer i;
            // recur for all vertices adjacent to this vertex
            ListIterator<Integer> iterator = adjList[n].listIterator();
            while (iterator.hasNext())
            {
                i = iterator.next();
                if(visited[i] == false)
                {
                    visited[i] = true;
                    topSorUtil(i, visited, stack);
                }
            }
            // push the element into stack after visiting all of its adjacent nodes
            stack.push(n);
        }


        // tester method for topological sorting
        public static void main(String[] args)
        {

            Graph graph = new Graph(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(2, 0);
            graph.addEdge(2, 3);
            graph.addEdge(3, 3);

            topologicalSort();
            /**
             * Output is : 0 1 2 3 which is different from DFS
             */
        }
    }

}
