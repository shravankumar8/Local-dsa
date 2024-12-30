package Stack;

import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(14);
        stack.push(14);
        System.out.println("Stack"+stack);
        System.out.println("Top element: " + stack.peek());

    }
}
