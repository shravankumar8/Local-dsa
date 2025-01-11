package BasicMath;
// Initial Setup Start with𝑛=56 n=56. Keep a list to store prime factors.

// Step 1:Divide by 2 2 56÷2=28 56÷2=28. Add 2 2 to the list.28÷2=14 28÷2=14. Add 2 2 to the list.14÷2=7 14÷2=7. Add 2 2 to the list.7÷2 7÷2 is not possible.Stop dividing by 2 2. Now,𝑛=7 n=7,and the factors list is[2,2,2][2,2,2].

// Step 2:Move to the Next Odd Factor Check 3 3:7÷3 7÷3 is not possible(not divisible).Check 5 5:7÷5 7÷5 is not possible.Step 3:Handle the Remaining Number𝑛=7 n=7. Since 7>2 7>2 and it’s a prime number,add 7 7 to the list.Final Prime Factors:[2,2,2,7][2,2,2,7].

// Why Does This Work?Dividing by Smallest Prime First:Eliminates multiples of 2 2,reducing𝑛n quickly.Odd Factors Up to𝑛n ​:Efficiently finds all other small factors.Remaining Prime Number:Any leftover𝑛>1 n>1 must be prime because it wasn’t divisible by any smaller number.Algorithm In simple terms:

// Start with 2 2(smallest prime).Repeatedly divide𝑛n by 2 2 until it’s no longer divisible.Check every odd number starting from 3 3 up to𝑛n ​.If𝑛n is still greater than 2 2,add it as a prime factor.This ensures all prime factors are found efficiently.


public class PrimeFactors {
    static void LCM(int n){
        while(n%2==0){
            System.out.println(2);
            n /=2;


        }
     for(int i=3;i<Math.sqrt(n);i+=2){
        while(n%i==0){
            System.out.println(i);
            n /= i;

        }
     }
    //  base case if the remainder is a prime positive number
     if(n>2){
        System.out.println(n);
     }

    }
    public static void main(String[] args) {
        LCM(315);
    }
}
