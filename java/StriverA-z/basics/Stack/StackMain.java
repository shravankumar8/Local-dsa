public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack();
        stack.insert(5);
        stack.insert(35);
        stack.insert(55);
        stack.insert(53);
        stack.insert(52);
        stack.insert(573);
        stack.insert(573);
        stack.insert(573);
        stack.insert(573);
        stack.insert(573);
        stack.insert(573);
       
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
       
       

    }

}
