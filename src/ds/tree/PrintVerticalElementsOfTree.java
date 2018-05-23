package ds.tree;

/**
 * Given a binary tree, print it's elements vertically
 *           1
 *         /  \
 *        2    3
 *       / \  / \
 *      4  5 6  7
 *           \   \
 *           8   9
 *
 *
 * The output of print this tree vertically will be:
 * 4
 * 2
 * 1 5 6
 * 3 8
 * 7
 * 9
 *
 * SOLUTION : GEEKSFORGEEKS
 * The idea is to traverse the tree once and get the minimum and maximum horizontal distance with respect to root.
 * For the tree shown above, minimum distance is -2 (for node with value 4) and maximum distance is
 * 3 (For node with value 9).
 * Once we have maximum and minimum distances from root, we iterate for each vertical line at distance minimum to
 * maximum from root, and for each vertical line traverse the tree and print the nodes which lie on that vertical line.
 *
 */
public class PrintVerticalElementsOfTree {

    // Node class represents each element of the binary tree
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int item)
        {
            this.data = item;
            left = right = null;
        }
    }

    // class that holds min and max values / distance from the root element
    static class Values {
        public static int min, max;
    }

    static class BinaryTree
    {
        Node root;
        Values values = new Values();


        public void printVerticalOrder(Node node)
        {
            // find min and max distance from root
            findMinMax(node, values, values, 0);

            // Iterate through all possible vertical lines starting
            // from the leftmost line and print nodes line by line
            for (int line_no = values.min; line_no <= values.max; line_no++)
            {
                printVerticalLine(node, line_no, 0);
                System.out.println(" ");
            }

        }

        /**
         * function to print
         */
        private void printVerticalLine(Node node, int line_no, int hd) {
            if(node == null)
            {
                return;
            }
            // if this node is in given line number
            if(hd == line_no)
            {
                System.out.print(node.data + " ");
            }

            // recur same for left and right sub tree
            printVerticalLine(node.left, line_no, hd -1);
            printVerticalLine(node.right, line_no, hd + 1);
        }


        /**
         * An utility function to find min and max values respect to the root element
         * @param node
         * @param min
         * @param max
         * @param hd
         */
        private void findMinMax(Node node, Values min, Values max, int hd)
        {
            if(node == null)
            {
                return;
            }
            // update min and max values
            if(hd < min.min)
            {
                min.min = hd;
            } else if(hd > max.max)
            {
                max.max = hd;
            }

            // do it recursively for all the nodes in the binary tree both in left and right subtrees
            findMinMax(node.left, min, max, hd -1);
            findMinMax(node.right, min, max, hd + 1);
        }

        // Driver program to test the above functions
        public static void main(String args[])
        {
            BinaryTree tree = new BinaryTree();

            /* Let us construct the tree shown in above diagram */
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.left = new Node(6);
            tree.root.right.right = new Node(7);
            tree.root.right.left.right = new Node(8);
            tree.root.right.right.right = new Node(9);

            System.out.println("vertical order traversal is :");
            tree.printVerticalOrder(tree.root);
        }
    }






}
