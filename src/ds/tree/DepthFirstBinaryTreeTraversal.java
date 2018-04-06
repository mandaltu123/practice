package ds.tree;

public class DepthFirstBinaryTreeTraversal {

    /**
     * Pre-order traversal is VLR-> visit left right
     * @param root
     */
    public void preOrder(Node root) {

        if(root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * In-order traversal is LVR-> left, visit right
     * @param root
     */
    public void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    /**
     * Post-order traversal is LRV -> left right visit
     * @param root
     */
    public void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

}
