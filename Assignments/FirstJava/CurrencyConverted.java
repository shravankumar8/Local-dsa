import java.util.Scanner;

public class CurrencyConverted {
    static double Checker(int n){
  double conversionRate = 0.012;
  return n*conversionRate;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("WELCOME TO INR ₹ TO USD $ CONVERTED :");
        int num=in.nextInt();
    
        System.out.println("The converted Value is $$$"+Checker(num));
    }
}
