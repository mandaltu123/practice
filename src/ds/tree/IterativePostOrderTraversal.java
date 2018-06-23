package ds.tree;

import java.util.Stack;

/**
 * This problem can be solved with two stacks.
 */
public class IterativePostOrderTraversal {

    public static void iterativePostOrder(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            if (root.left != null) {
                s1.push(root.left);
            }
            if (root.right != null) {
                s1.push(root.right);
            }
        }

        while (!s2.isEmpty()) {
            root = s2.pop();
            System.out.print(root.data + " ");
        }
    }

    //worst run time for this algorithm is O(n) and since we are pushing each elements to the stack. the
    // space complexity is also O(n).

    /**
     * Iterative post order traversal test method
     *
     * @param args
     */
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        /* following is the tree after above statement

              1
            /   \
          null  null     */
        binaryTree.root.left = new Node(-1);
        binaryTree.root.right = new Node(11);
        binaryTree.root.left.left = new Node(-2);
        binaryTree.root.left.right = new Node(-3);
        binaryTree.root.left.right.right = new Node(5);

        binaryTree.root.right.left = new Node(21);
        binaryTree.root.right.right = new Node(6);

        iterativePostOrder(binaryTree.root);

    }

}

class BinaryTree {

    public Node root;
    public int data;

    public BinaryTree(int data) {
        this.data = data;
        root = new Node(data);
    }

    public BinaryTree() {
        root = null;
    }


    /**
     * Method to test this binary tree
     *
     * @param args
     */
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        /* following is the tree after above statement

              1
            /   \
          null  null     */
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
    }
}