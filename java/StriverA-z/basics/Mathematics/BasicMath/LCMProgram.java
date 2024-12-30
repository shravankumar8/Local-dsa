package BasicMath;

/**
 * This program calculates the GCD (Greatest Common Divisor) and LCM (Least
 * Common Multiple)
 * of two integers using simple mathematical logic.
 * 
 * Methods:
 * - LCM(int a, int b): Calculates LCM using the formula LCM = (a * b) / GCD(a,
 * b).
 * - GCD(int a, int b): Finds the GCD by iterating from min(a, b) to 1 and
 * returning the first common divisor.
 * 
 * Formula:
 * LCM(a, b) = (a * b) / GCD(a, b)
 * 
 * Usage:
 * - Run the main method to see GCD and LCM for predefined values.
 * 
 * Example:
 * Input: a = 12, b = 18
 * Output: GCD: 6, LCM: 36
 */
public class LCMProgram {
    static int LCM(int a, int b) {
        int Product = a * b;
        int LCM = Product / GCD(a, b);
        return LCM;

    }

    static int GCD(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;

            }
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println(LCM(5, 11));
    }
}
