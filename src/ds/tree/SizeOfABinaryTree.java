package ds.tree;

/**
 * Size of a binary tree is very simple. We need to find number of left children + number of right children + 1 for root
 * node.
 */
public class SizeOfABinaryTree
{


    public int size(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize + rightSize + 1;
    }
}
