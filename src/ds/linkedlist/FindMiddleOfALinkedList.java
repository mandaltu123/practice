package ds.linkedlist;

public class FindMiddleOfALinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void printMiddle(Node head) {
        Node current = head;
        Node fast = head;

        // idea is, when the first pointer reaches null that is end of the list, the slow pointer will remain at
        // middle of the list
        if(head != null) {
            while (fast != null && fast.next != null) {
                current = current.next;
                fast = fast.next.next;
            }
            System.out.println("The middle of the list is = " + current.data);
        }
    }

    public static void main(String[] args) {
        FindMiddleOfALinkedList list = new FindMiddleOfALinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(25);

        list.printMiddle(head);

    }
}
