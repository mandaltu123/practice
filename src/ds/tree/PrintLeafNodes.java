package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeafNodes {


    public static void printLeafNodes(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            root = queue.poll();
            if(root.left == null && root.right == null){
                System.out.println(root.data);
            } else {
                queue.add(root.left);
                queue.add(root.right);
            }
        }
    }

    /**
     * Main method creates a tree like :
     *        1
     *        /\
     *       2  3
     *      /\
     *     4 5
     *
     *     output of this program should be 3, 4, 5
     * @param args
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        Node firstLeft = new Node(2);
        Node firstRight = new Node(3);
        root.left = firstLeft;
        root.right = firstRight;

        Node secondLeft = new Node(4);
        Node secondRight = new Node(5);
        firstLeft.left = secondLeft;
        firstLeft.right = secondRight;

        printLeafNodes(root);
    }
}
