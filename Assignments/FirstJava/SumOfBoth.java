import java.util.Scanner;

public class SumOfBoth {
    static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        System.out.println("Welcome to the ADDER here you can add two numbers");
        System.out.print("Enter The first value to SUM :");
        int num=in.nextInt();
        System.out.print("Enter The second value to SUM :");
        int num2=in.nextInt();

        System.out.println("The addition is "+Sum(num, num2));

    }
}
