package ds.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TopViewOfABinaryTree {


    /**
     * This is a very nice problem really.
     *
     *
     * what we want to do is,
     * we would say that the root's horizontal distance is 0.
     * for left child the distance is -1 and for right child it is +1
     * @param root
     */
    public static void printTopView(Node root) {
        if(root == null){
            return;
        }
        Set<Integer> set = new HashSet<>();
        Queue<QItem> qItems = new LinkedList<>();
        qItems.add(new QItem(root, 0)); // we are adding 0 because at root, the distance is 0

        while (!qItems.isEmpty()) {
            QItem qItem = qItems.poll();
            Node node = qItem.n;
            int distance = qItem.hd;
            // if the distance is not there in the set, that means we can add it and print
            if(!set.contains(distance)){
                set.add(distance);
                System.out.print(node.data + " ");
            }
            //
            if(node.left != null){
                qItems.add(new QItem(node.left, distance -1));
            }
            if(node.right != null){
                qItems.add(new QItem(node.right, distance + 1));
            }
        }
    }


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

        Node leftSecond = new Node(6);
        Node rightSecond = new Node(7);
        firstRight.left = leftSecond;
        firstRight.right = rightSecond;

        printTopView(root);

    }

}


class QItem{
    Node n;
    int hd;

    public QItem(Node n, int hd) {
        this.n = n;
        this.hd = hd;
    }
}