public class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;
    
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
