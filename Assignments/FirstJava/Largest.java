import java.util.Scanner;

public class Largest {
     static int Checker(int n, int k){
        if(n>k){
            return n;
        }else{
            return k;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = in.nextInt();
        System.out.print("Please enter a number :");
        int num1 = in.nextInt();
        System.out.println(Checker(num,num1));
    }
}
