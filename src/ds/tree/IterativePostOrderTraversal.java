package ds.tree;

import java.util.Stack;

/**
 * This problem can be solved with two stacks.
 */
public class IterativePostOrderTraversal {

    public void iterativePostOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty())
        {
            root = s1.pop();
            s2.push(root);
            if(root.left != null)
            {
                s2.push(root.left);
            }
            if(root.right != null)
            {
                s2.push(root.right);
            }
        }

        while (!s2.isEmpty())
        {
            root = s2.pop();
            System.out.println(root.data);
        }
    }

    //worst run time for this algorithm is O(n) and since we are pushing each elements to the stack. the
    // space complexity is also O(n).

}
