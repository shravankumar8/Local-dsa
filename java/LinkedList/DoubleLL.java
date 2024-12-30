package LinkedList;
class Node{
    int data;
    Node prev,next;
    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DoubleLinkedList{
    Node head;
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head !=null){
            head.prev=newNode;

        }
        head=newNode;

    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            return;
        }
        Node last=head;
        while(last.next != null){
            last=last.next;

        }
        last.next=newNode;
        newNode.prev=last;
    }

    public void deleteAtEnd(){
        if(head==null || head.next==null){
            head=null;
        }
        Node last=head;
        while(last.next != null){
            last=last.next;



        }
        last.prev.next=null ;
    }
}

public class DoubleLL {
    
}
