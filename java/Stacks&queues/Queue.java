import java.util.ArrayList;
public class Queue<T> {
    private ArrayList<T>queueList;
    public Queue(){
        this.queueList= new ArrayList<>();
    }
    public void enqueue(T data){
        queueList.add(data);
    }
        public T dequeue(){
            if(isEmpty()){
                throw new IllegalStateException("Queue is empty ");
            };
            return queueList.remove(0);

        }
        public T peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cannot peek.");
        };

           
            return queueList.get(0);

        };
        public boolean isEmpty(){
            return queueList.isEmpty();
        };
        public int size(){
            return queueList.size();
        };
        public void display(){
            System.out.println("Queue :"+ queueList);
        };

        public static void main(String[] args){
            Queue<Integer> queue = new Queue<>();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.display();
            System.out.println("Front element"+queue.peek());
            System.out.println("deque"+queue.dequeue());
            queue.display();
        
        
        }
    
}
