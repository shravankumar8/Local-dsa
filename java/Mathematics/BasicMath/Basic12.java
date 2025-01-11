package BasicMath;
// Program to find LCM of two numbers Last Updated:23 Nov,2024 LCM of two numbers is the smallest number which can be divided by both numbers.

// Input:a=12,b=18 Output:36 36 is the smallest number divisible by both 12 and 18

// Input:a=5,b=11 Output:55 55 is the smallest number divisible by both 5 and 11

// A simple solution is to find all prime factors of both numbers,then find union of all factors present in both numbers.Finally,return the product of elements in union.

// An efficient solution is based on the below formula for LCM of two numbers‘a’and‘b’.

// relation---------between---------hcf---------and---------lcm_________ a x b=LCM(a,b)*GCD(a,b)
public class Basic {
    static int LCM(int a , int b){
        for(int i=Math.min(a, b);i>0;i--){
            if(a%i==0 && b%i==0){
                return i;

            }


        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(LCM(10, 70));
    }
    
}
