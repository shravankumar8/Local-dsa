package LinkedList;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {

    private Node head = null;

    public void insertAtBeggining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp=temp.next;

            }
            newNode.next=head;
            temp.next=newNode;
            head=newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;

            }
            temp.next=newNode;
            newNode.next=head;

        }
    }
    public void deleteAtbegginning(){
        if(head==null){
            System.out.println("the list is empty ");
            return ;
        }
        if(head.next==head){
            head=null;
        }else{
            Node temp=head;
            while(temp.next !=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
        }
    }







}

public class SingleCircle {

}
