import java.util.Scanner;

public class Calculator {
static int Add(int a , int b){
    return a+b;
}
static int Sub(int a,int b){
    return a-b;
}
static int Mul(int a,int b){
    return a*b;
}
static int Div(int a, int b){
    return a/b;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the Operation");
        System.out.println("1. Additiion \n 2. Subtracion \n 3. Multiplication \n 4. Division");
        int option = in.nextInt();
        System.out.println("Thanks for choosing the calue ");
        System.out.print("Enter num 1 :");
        int num1=in.nextInt();
        System.out.print("Enter num 2 :");
        int num2=in.nextInt();
        if(option==1){
            System.out.println("The Addition of "+ Add(num1,num2));
        }else if(option==2){
            System.out.println("The Subtraction of"+ Sub(num1,num2));

        }else if(option==3){
            System.out.println("The Mulitplication ofof" + Mul(num1, num2));
        }else{
            System.out.println("The Division of  " + Div(num1, num2));
        }
    }
}