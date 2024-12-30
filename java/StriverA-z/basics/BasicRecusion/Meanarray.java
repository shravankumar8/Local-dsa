public class Meanarray {

    static int Mean(int index, int arr[], int sum) {
        if (index == arr.length) {

          
            return sum / arr.length;
        }
        sum += arr[index];
        return Mean(index + 1, arr, sum);

    }

    public static void main(String[] args) {
        int arr[] = { 3,7,10,5 };
        
        System.out.println(Mean(0, arr, 0));
    }

}