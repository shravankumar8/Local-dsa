package BasicMath;
import java.util.Scanner;
// Sum of squares of first n natural numbers

// Given n, find sum of squares of first n natural numbers. 
// Examples : 

// Input : n = 2
// Output: 5
// Explanation: 1^2+2^2 = 5

// Input : n = 8
// Output: 204
// Explanation :  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 = 204 
public class SumofSqares {
static int findSum(int num){
    int sum=0;
    for(int i =0;i<=num;i++){
        sum=sum+(i*i);
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a numer");
        int userInput=input.nextInt();
        System.out.println("the sum is "+findSum(userInput));
        
        
    }
    
}
