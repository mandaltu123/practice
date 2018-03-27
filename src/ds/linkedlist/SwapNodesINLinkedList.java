package ds.linkedlist;

/**
 * Input:  10->15->12->13->20->14,  x = 12, y = 20
 Output: 10->15->20->13->12->14

 Input:  10->15->12->13->20->14,  x = 10, y = 20
 Output: 20->15->12->13->10->14

 Input:  10->15->12->13->20->14,  x = 12, y = 13
 Output: 10->15->13->12->20->14
 */
public class SwapNodesINLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void swapNodes(int x, int y) {
        if(x == y) {
            return;
        }

        // search for x and keep track of current x and previous x

        Node prevX = null;
        Node currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // do the same for y
        Node prevY = null;
        Node currY = head;

        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // if either x or Y is not present nothing to do
        if(currX == null || currY == null) {
            return;
        }

        // if x is not the head of linked list
        if (prevX != null) {
            prevX.next = currY;
        } else {
            // make y the new head
            head = currY;
        }


        // if Y is not the head of linked list
        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {

        SwapNodesINLinkedList list = new SwapNodesINLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(25);


        list.swapNodes(85, 4);
        list.printList(head);

    }



}
