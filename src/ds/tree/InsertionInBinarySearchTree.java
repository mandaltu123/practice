package ds.tree;

public class InsertionInBinarySearchTree
{


    /**
     *
     * @param root
     * @param data
     * @return
     */
    public Node insert(Node root, int data)
    {

        Node node = new Node(data);
        if(root == null)
        {
            return node;
        }

        Node parent = null;
        Node current = root;
        while (current != null)
        {
            parent = current;
            if(current.data < data)
            {
                current = current.right;
            } else
            {
                current = current.left;
            }
        }
        // Now we have found the parent against which our new node is going to sit
        if(parent.data <= data)
        {
            parent.right = node;
        } else
        {
            parent.left = node;
        }
        return root ;
    }
}
