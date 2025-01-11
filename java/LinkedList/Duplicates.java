public class Duplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // Add the new node at the end
        }
    }
    
    public void deleteNode(int key) {
        Node current = head;
        Node previous = null;

        // Check if the head node holds the key
        if (current != null && current.data == key) {
            head = current.next; // Move head to the next node
            System.out.println("Node with value " + key + " deleted.");
            return;
        }

        // Search for the key in the list
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // If the key is not found
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }

        // Unlink the node from the list
        previous.next = current.next;
        System.out.println("Node with value " + key + " deleted.");
    }
    
    public void displayList() {
        Node current = head;

        // Check if the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("Linked List:");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }



    public void removeDup(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp.next=temp.next.next;
            }
        }
        


    }
    
    public static void main(String[] args) {
        Duplicates list = new Duplicates();

        // Adding nodes
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);

        // Display the list
        list.displayList();

        // Deleting a node

    }


}