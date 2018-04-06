package ds.tree;

import java.util.List;

/**
 * Write a method to search a path where root to leaf sum (sum of data in that path ) is equal to given input data
 */
public class RootToLeafSum
{
    public boolean rootToLeafSum(Node root, int sum, List<Integer> path)
    {
        if(root == null)
        {
            return false;
        }

        if(root.left == null && root.right == null) // check leaf node
        {
            if(root.data == sum)
            {
                path.add(root.data);
                return true;
            } else
            {
                return false;
            }
        }

        if(rootToLeafSum(root.left, sum - root.data, path))
        {
            path.add(root.left.data);
            return true;
        }

        if(rootToLeafSum(root.right, sum - root.data, path))
        {
            path.add(root.right.data);
            return true;
        }

        return false;
    }
}
