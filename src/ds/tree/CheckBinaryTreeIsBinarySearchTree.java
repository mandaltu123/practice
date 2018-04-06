package ds.tree;

/**
 * Given a root node find that the tree is a binary search tree or not.
 *
 * We will take INTEGER.MAX and INTEGER.MIN as max and min numbers.
 * we will start at root and check if the left node is in between min and root's value or not. We do this
 * recursively for all nodes. Similarly we check for the right nodes, where min becomes root's data and
 * max becomes the max value, we need to check all the right nodes are withing this range, and we need to
 * do it recursively for all the nodes. The time complexity of this algorithm is O(n) as we have to check all
 * the nodes in the tree.
 */
public class CheckBinaryTreeIsBinarySearchTree
{
    public boolean isBinarySearchTree(Node root, int min, int max)
    {
        if(root == null)
        {
            return true;
        }
        if(root.data <= min || root.data > max)
        {
            return false;
        }

        return isBinarySearchTree(root.left, min, root.data)
                && isBinarySearchTree(root.right, root.data, max);
    }
}
