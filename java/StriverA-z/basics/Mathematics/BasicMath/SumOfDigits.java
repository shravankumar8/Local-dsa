package BasicMath;
// Program for Sum of the digits of a given number Last Updated:28 Nov,2024 Given a number n,find the sum of its digits.

// Examples:

// Input:n=687 Output:21 Explanation:The sum of its digits are:6+8+7=21

// Input:n=12 Output:3 Explanation:The sum of its digits are:1+2=3
public class SumOfDigits {
    static int Summer(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;

        }
        return sum;
    }
public static void main(String[] args) {
    System.out.println(Summer(687));
}
}
