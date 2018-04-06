package ds.tree;

/**
 * Definition of binary search tree: BST is a regular binary tree with one condition that left child is
 * always less than parent and right child is greater than parent. And this is true recursively for every
 * Node.
 */
public class SearchInBinarySearchTree
{

    public Node search(Node root, int key)
    {

        if(root == null)
        {
            return null;
        }
        if(root.data == key)
        {
            return root;
        } else if(root.data < key)
        {
            return search(root.right, key);
        } else
        {
            return search(root.left, key);
        }
    }

}
