package ds.tree;

public class RightViewBinaryTree {

    static Node root;
    static int maxa_level = 0;

    public static void rightViewUtil(Node root, int level) {
        if (root == null) {
            return;
        }
        // check whether it is the last element in that level
        if (maxa_level < level) {
            System.out.print(root.data + " ");
            maxa_level = level;
        }
        rightViewUtil(root.right, level + 1);
        rightViewUtil(root.left, level + 1);
    }

    public static void rightView() {
        rightViewUtil(root, 1);
    }

    public static void main(String[] args) {
        RightViewBinaryTree tree = new RightViewBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        rightView();
    }
}

