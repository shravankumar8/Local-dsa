// Sum of digit of a number using recursion
// Last Updated : 02 Jun, 2024
// Given a number, we need to find sum of its digits using recursion.
// Examples: 
 

// Input : 12345
// Output : 15

// Input : 45632
// Output :20
          

public class SumofDigit {
    static int Summer(int n){
        if(n<1){
            return 0;
        }
        Syst
            
          return n%10+Summer(n/10);

    }
    public static void main(String[] args) {
        System.out.println( Summer(2345));
    }
    
}
