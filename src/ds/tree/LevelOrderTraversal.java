package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level order traversal is printing all the elements at a given level.
 */
public class LevelOrderTraversal
{
    public void levelORderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            root = queue.poll();
            System.out.println(root.data);
            if (root.left != null)
            {
                queue.add(root.left);
            }

            if(root.right != null)
            {
                queue.add(root.right);
            }
        }
    }
}
