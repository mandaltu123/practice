package ds.tree;

public class RightViewOfATree {


    public static void printRightView(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        // we don't have to check the left
        if(root.right != null) {
            printRightView(root.right);
        }
    }


    /**
     * Main method creates a tree like :
     *        1
     *        /\
     *       2  3
     *      /\ / \
     *     4 5 6 7
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

        Node secondLeft = new Node(4);
        Node secondRight = new Node(5);
        firstLeft.left = secondLeft;
        firstLeft.right = secondRight;

        Node leftSecond = new Node(6);
        Node rightSecond = new Node(7);
        firstRight.left = leftSecond;
        firstRight.right = rightSecond;

        printRightView(root);
    }
}
