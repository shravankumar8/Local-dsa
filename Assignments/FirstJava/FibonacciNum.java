import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 0; i <= n; i++) {
            third = second + first;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
   
    
   
}
