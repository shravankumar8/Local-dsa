package Stack;
import java.util.ArrayList;
import java.util.List;

public class Stack<T>{

    private List<T> stackList;
    public Stack(){
        this.stackList=new ArrayList<T>();

    }
    public void push(T data){
        stackList.add(data);
    }
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty , cannot peek");

        };
       return stackList.remove(stackList.size()-1);

    }
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("The stack is empty , cannot peek");
        };
        return stackList.get(stackList.size()-1);

    }
    public void display(){
        System.out.println("Stack :"+stackList);
    }
    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Peek"+stack.peek());
        System.out.println("pop"+stack.pop());
         stack.display();


    }

}
