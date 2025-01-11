
private class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;

    }

    public class LinkedList {

        private Node head;
        private Node tail;
        private int size;
        public LinkedList(){
            size=0;
        }
// here create a method which take in a value and ads it in the front of the linkedlist
public void insertFirst(int value){
    Node node= new Node(value);
    node.next=head;
    head=node;
    if(tail==null){
        tail=node;
    }
    size+=1;
}
   
// display a linkedlist
// let a node=head while node not equal to null print node and do node=node.next;
public void display(){
    Node temp=head;
    while (temp!= null) {
        System.out.println(temp+" --> ");
        temp=temp.next;
        
    }
}



    }

}

public class LL {
    public static void main(String[] args) {

    }

}