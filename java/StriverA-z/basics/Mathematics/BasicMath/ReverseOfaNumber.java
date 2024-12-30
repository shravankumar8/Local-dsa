package BasicMath;
// Write a program to reverse digits of a number Last Updated:29 Nov,2024 Given an Integer n,find the reverse of its digits.

// Examples:

// Input:n=12345 Output:54321 Explanation:The output“54321”for the input num=12345 represents the number reversed from its original order.

// Input:n=876 Output:678 Explanation:The output“678”for the input num=876 represents the number reversed from its original order.
public class ReverseOfaNumber {
    static int Reverser(int num){
        int rev=0;
        int last;
        while(num>0){
            last=num%10;
            rev=rev*10+last;
            num=num/10;

        }
        return rev;

    }
    public static void main(String[] args) {
        System.out.println(Reverser(34534));
    }
}
