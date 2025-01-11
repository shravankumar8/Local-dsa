public class CustomQueue {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];

    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == -0;
    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue full hai !!");
        }
        data[end++] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("empty queue");
        }

        // return the data at zeroth index and also now update the data in the array
        int ans = data[0];
        for (int i = 1; i < end ; i++) {

            data[i - 1] = data[i];
        }
        data[end - 1] = 0;
        end--;
        return ans;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("empty queue");
        }
        return data[0];

    }
}
