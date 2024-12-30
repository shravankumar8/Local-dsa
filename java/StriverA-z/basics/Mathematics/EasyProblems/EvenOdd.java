import java.util.Scanner;
public class EvenOdd {
    static boolean Checker(int n){
        return (n & 1)==1;
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("its odd"+Checker(number));

        
    }
}
