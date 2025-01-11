package Stack;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}
class Stack{
    private Node top;
    public Stack(){
        this.top=null;
    }
    public boolean isEmpty(){
        return this.top==null;
    }
    public void push(int data){
        Node newNode= new Node(data);
        newNode.next=top;
        top=newNode;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData=top.data;
        top=top.next;
        return poppedData;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("The Stack is empty ");

        }
        return top.data;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node current=top;
        System.out.println("Stack ELements");
        while(current!=null){
            System.out.print(currentwebv.data);
            current=current.next;
        }
        System.out.println();

    }
}
public class Stackll {

    
}
