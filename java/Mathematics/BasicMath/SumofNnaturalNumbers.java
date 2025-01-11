package BasicMath;
// Sum of Sums first n natural numbers Last Updated:25 Nov,2024 Given a positive integer n.The task is to find the sum of the sum of first n natural number.

// Examples:

// Input:n=3 Output:10 Explanation:Sum of first natural number:1 Sum of first and second natural number:1+2=3 Sum of first,second and third natural number=1+2+3=6 Sum of sum of first three natural number=1+3+6=10

// Input:n=2 Output:4

// Sum of Natural Numbers is represented by Triangular Numbers.A simple solution is to one by one add triangular numbers.

// solutiin two methoods the first one brute forces .
// method 1 

public class SumofNnaturalNumbers {

    static int method1(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
     sum=sum+i*(i+1)/2;
        }
     
        return sum;
    }


    static int innerLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;

        }

        return sum;
    }

    static int outerLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + innerLoop(i);

        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(method1(2));
    }
}
