package Stack;
class Stack{
    private int[] stack;
    private int top;
    private int capacity;
  public Stack(int capacity){
    this.capacity=capacity;
    stack=new int[capacity];
    top=-1; 


    }
    public void push (int data){
        if(isFull()){
            System.out.println("Stack overflow , cannot push "+data);
            return;

        }
        stack[++top]=data;
        System.out.println("Pushed " + data + " to stack.");

        
    }
    public int pop(){
        

    }
}
public class Stack2 {

    
}
