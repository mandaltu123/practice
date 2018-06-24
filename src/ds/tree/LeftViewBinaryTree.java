package ds.tree;

public class LeftViewBinaryTree {

    private static Node root;
    static int max_level = 0;

    public static void leftViewUtil(Node root, int level) {
        // base case
        if (root == null) {
            return;
        }



        // If this is the first node of this level
        if (max_level < level) {
            System.out.print(root.data + " ");
            max_level = level;
        }
        // recur for left and right sub tree
        leftViewUtil(root.left, level + 1);
        leftViewUtil(root.right, level + 1);
    }

    // A wrapper over leftViewUtil()
    static void leftView()
    {
        leftViewUtil(root, 1);
    }

    public static void main(String[] args) {
        /* creating a binary tree and entering the nodes */
        LeftViewBinaryTree tree = new LeftViewBinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        leftView();
    }
}
