package LinkedList;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;

        }
        last.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;

        }
        secondLast.next = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

}

public class SingleLL {

    public static void main(String[] agrs) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtBeginning(2);
        list.printList();

    }
}
