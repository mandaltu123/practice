package ds.tree;

/**
 * In order to find the height of a binary tree, we need to find the max height in either left subtree
 * or the right subtree + 1 for the root node
 */
public class HeightOfABinaryTree
{
    public int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
