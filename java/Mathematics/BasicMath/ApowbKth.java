package BasicMath;
// K-th digit in‘a’raised to power‘b’
// Given three numbers a,b and k,find k-th digit in ab from right side Examples:

// Input:a=3,b=3,k=1 Output:7 Explanation:3^3=27 for k=1. First digit is 7 in 27

// Input:a=5,b=2,k=2 Output:2

// Explanation:5^2=25 for k=2. First digit is 2 in 25
public class ApowbKth {
    
    static int Solver(int a,int b, int k){
        int result=(int) Math.pow(a, b);
        int num=result;
        int count=0;
        int lastdigit=0;

        while(count<k){
           
            lastdigit=num%10;

            num=num/10;
            count++;
        }
       
        
        return lastdigit;
    }
    public static void main(String[] args) {
        System.out.println(Solver(5, 5, 1));
    }
}
