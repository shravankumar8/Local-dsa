public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) throws StackException {
        // this thiing take care when th array is full then we double the array and copy the shit
        if (this.isFull()) {
            int[] newArr = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                
                newArr[i] = data[i];

            }
            data = newArr;
            

        }

       return super.insert(item);

    }

}
