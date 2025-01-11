public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);

    }

    public CustomStack(int size) {
        this.data = new int[size];

    }

    
public  boolean isFull(){

   return ptr==data.length-1;
}
public boolean isEmpty(){
    return ptr==-1;
}

public int pop() throws StackException{
    if(isEmpty()){
        throw new StackException("The stack is empty");
    }
   
    // Else remove the ptr element from the top of the stack 
    // else 
    return data[ptr--];
   
}
public int peek() throws StackException{
    if(isEmpty()){
        throw new StackException("The stack is empty");
    }
    return data[ptr];
}
public boolean insert(int item) throws StackException{
    if(isFull()){
        throw new StackException("The stack is full");

    }
    ptr++;
    data[ptr]=item;
    return true;

}

}