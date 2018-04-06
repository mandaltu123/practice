package ds.linkedlist;

public class MergeTwoSortedLinkedLists {

    static Node head;

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   /* public Node mergeLists(Node list1, Node list2) {
        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }

        Node newhead;
        if(list1.data < list2.data) {
            newhead = list1;
        } else {
            head = list2;
            list2 = list1;
            list1 = head;
        }

        while (list1.next != null) {
            if (list1.next.data > list2.data) {
                Node tmp = list1.next;
                list1.next = list2;
                list2 = tmp;
            }
            list1 = list1.next;
        }
        list1.next = list2;
        return head;
        }

    }*/

}
