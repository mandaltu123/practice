package ds.tree;

/**
 * Given two root nodes, determine whether two binary trees are same or not.
 */
public class SameBinaryTree
{

    public boolean sameBinaryTree(Node root1, Node root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }

        if(root1 == null || root2 == null)
        {
            return false;
        }

        return ((root1.data == root2.data)
                && (sameBinaryTree(root1.left, root2.left))
                && (sameBinaryTree(root1.right, root2.right)));
    }
}
