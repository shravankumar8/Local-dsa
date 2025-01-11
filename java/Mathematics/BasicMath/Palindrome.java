package BasicMath;
// Check if a number is Palindrome Last Updated:05 Dec,2024 Given a positive integer n,find whether the number is Palindrome or not.A number is a Palindrome if it remains the same when its digits are reversed.

// Examples:

// Input:n=12321 Output:true Explanation:12321 is a Palindrome number because after reversing its digits,the number becomes 12321 which is same as the original number.

// Input:n=1234 Output:false Explanation:1234 is not a Palindrome number because after reversing its digits,the number becomes 4321 which is different from the original number.

public class Palindrome {
    static boolean Palindrome(int num){
        int rev=0;
        int originalNu=num;
        int lastdigit;
        while(num>0){
            lastdigit=num%10;
            num=num/10;
            rev=rev*10+lastdigit;

        }
        if(rev==originalNu){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println( Palindrome(12321));

    }
}
