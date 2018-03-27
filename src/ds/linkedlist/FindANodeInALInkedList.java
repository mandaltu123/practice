package ds.linkedlist;

public class FindANodeInALInkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public boolean findNode(Node head, Node toFind) {
        boolean isFound = false;
        Node temp = head;

        while (temp != null) {
            if (temp.data == toFind.data) {
                isFound = true;
            }
            temp = temp.next;
        }
        return isFound;
    }

    public static void main(String[] args) {
        FindANodeInALInkedList list = new FindANodeInALInkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        Node toBeFound = new Node(15);
        boolean isFound = list.findNode(head, toBeFound);
        System.out.println(isFound);

    }
}
