
/*
 * Factorial Calculation (Fact(int a))
Purpose: Computes the factorial of a (i.e., a!).
Edge Cases:
If a == 0 or a == 1, return 1 (since 0! = 1 and 1! = 1).
Algorithm:
If a is 0 or 1, return 1.
Otherwise, multiply numbers from 1 to a to compute the factorial.
Binomial Coefficient (Binomial(int n, int r))
Purpose: Computes the binomial coefficient 
𝐶
(
𝑛
,
𝑟
)
=
𝑛
!
𝑟
!
(
𝑛
−
𝑟
)
!
C(n,r)= n!/r!(n−r)!

​
 .
Input Validation:
If r > n or r < 0, return -1 (invalid input).
Handle edge cases like C(n, 0) = 1 and C(n, n) = 1.
Algorithm:
Validate r (must be 0 <= r <= n).
Calculate factorials of n, r, and n-r using Fact() method.
Return 
𝐶
(
𝑛
,
𝑟
)
C(n,r).
Main Method (main(String[] args))
Purpose: Tests the Binomial method with sample inputs.
Example:
Binomial(4, 0) outputs 1 because 
𝐶
(
4
,
0
)
=
1
C(4,0)=1.
Edge Cases
Fact(0) and Fact(1) return 1.
Binomial coefficient handles C(n, 0) and C(n, n) as 1.
If r > n or r < 0, returns -1.
Example Outputs
Binomial(4, 0) → 1
Binomial(5, 3) → 10
Binomial(5, 7) → -1 (invalid input)
 */
public class BinomialCoef {

    

    static int Fact(int a) {
        if(a==0 || a==0){
            return 1;
        }
        int Pro = 1;
        for (int i = 1; i <= a; i++) {

            Pro *= i;

        }
        return Pro;
    }

    static int Binomial(int n, int r) {
        if(r==0 || r==n){
            return 1;
        }
        if (r > n || r < 0) { // Check if r is outside valid bounds
            return -1; // Return error code for invalid input
        }
       
        

        return Fact(n) / (Fact(r) * Fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println(Binomial(4, 0));
    }
}
