import java.util.Arrays;
public class missingNumber {
    


    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];

            if (arr[i] >= arr.length) {
                i++;
                continue;
            }
            if (arr[correctIndex] != arr[i]) {
                // swap
                int temp = arr[correctIndex];

                arr[correctIndex] = arr[i];
                arr[i] = temp;

            } else {
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                System.out.println(j);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }

}


