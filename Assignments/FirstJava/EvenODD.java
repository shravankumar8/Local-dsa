

import java.util.Scanner;

// Write a program to print whether a number is even or odd,also take input from the user.
public class EvenODD {
    static boolean Checker(int n){
if(n%2==0){
    return true;
    }else{
        return false;
    }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = in.nextInt();
        System.out.println(Checker(num));
    }

}
