import java.util.Arrays;

public class cycliicSort {
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
           

            if (arr[correctIndex] != arr[i]) {
                // swap
                int temp = arr[correctIndex];

                arr[correctIndex] = arr[i];
                arr[i] = temp;

            } else {
                i++;
            }
           
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 8,1 };
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }

}
