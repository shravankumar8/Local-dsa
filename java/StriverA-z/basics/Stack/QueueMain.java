public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue que = new CustomQueue(10);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.insert(6);

        que.display();
        que.pop();
        que.display();

    }
}
