import java.util.Scanner;

public class Demo {
    static int[] Sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[min]) {
                    min = i;

                }
                int temp = arr[j];
                arr[i] = arr[min];
                arr[min] = temp;

            }
            return arr;

        }
       

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int [] arr= new int[n];
       System.out.println(n);
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
            
        }
        Sorted(arr);
       
     
    }
}
