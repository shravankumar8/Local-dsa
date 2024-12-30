import java.util.Scanner;
public class Vscode {
    
    public static void main(String[] args) {
        int x,y,sum;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=myObj.nextInt();
        System.out.println("Type another number");
        y=myObj.nextInt();
        sum=x+y;
        System.out.println(sum);
    }
}
