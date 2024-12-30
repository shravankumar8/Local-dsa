import java.util.Scanner;
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimipleItrest {
    static int Calculator(int a,int b, int c ){
        int anser=(a*b*c)/100;
        return anser;
    }
    public static void main(String[] args) {
        System.out.println("Enter (Principle , time rate )");
        Scanner in= new Scanner(System.in);
        System.out.print("input Principle :");
        int principle= in.nextInt();
        System.out.print("input Time :");
        int time= in.nextInt();
        System.out.print("input Rate :");
        int rate= in.nextInt();
        System.out.println(Calculator(principle, time, rate));


    }
}
