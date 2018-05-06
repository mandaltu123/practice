package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintHalfNodes {

    public static void printHalfNodes(Node root) {
        if(root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
           root = queue.poll();
           if((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
               System.out.println(root.data);
           }
           if(root.left != null) {
               queue.add(root.left);
           }
           if(root.right != null) {
               queue.add(root.right);
           }
        }
    }

    /**
     * Main method creates a tree like :
     *        1
     *        /\
     *       2  3
     *       \  \
     *       5  7
     *          \
     *           8
     *
     *     output of this program should be 1, 3, 7
     * @param args
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        Node firstLeft = new Node(2);
        Node firstRight = new Node(3);
        root.left = firstLeft;
        root.right = firstRight;

        //Node secondLeft = new Node(4);
        Node secondRight = new Node(5);
//        firstLeft.left = secondLeft;
        firstLeft.right = secondRight;

//        Node leftSecond = new Node(6);
        Node rightSecond = new Node(7);
//        firstRight.left = leftSecond;
        firstRight.right = rightSecond;
        Node thirdRight = new Node(8);
        rightSecond.right = thirdRight;

        printHalfNodes(root);
    }
}
