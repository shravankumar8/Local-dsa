
import java.util.Scanner;

class PrinterPatterns {
    // *****
// *****
// *****
// *****
// *****

    public void print1(int num1) {

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

    public void print2(int num1) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            };
            System.out.println();
        };
    }

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
    public void print3(int num1) {
        for (int i = 0; i < num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            };
            System.out.println();
        };
    }

// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
    public void print4(int num1) {
        for (int i = 1; i < num1 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            };
            System.out.println();
        };
    }

// print6 prints 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// *     
    public void print5(int num1) {
        for (int i = num1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            };
            System.out.println();
        };
    }

// print6 prints 
// 1 2 3 4 5 6 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
    public void print6(int num1) {
        for (int i = num1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            };
            System.out.println();
        };
    }

//     *     
//     ***    
//    *****   
//   *******
    public void print7(int num1) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1 - i + 1; j++) {
                System.out.print(" ");
            };
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < num1 - i + 1; j++) {
                System.out.print(" ");
            };

            System.out.println("");
        };
    }


// *********
//  ******* 
//   *****  
//    ***   
//     *  
    public void print8(int num1) {
        for (int i = 0; i < num1; i++) {
            

            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            };
            for (int j = 0; j <2*num1-(2*i+1) ; j++) {
                System.out.print("*");
            };

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            };

            System.out.println("");
        };
    }

//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     * 
    public void print9(int num1){
        for(int i=0;i<num1;i++){


            for(int j=0;j<num1-i-1;j++){
                System.out.print(" ");
            };
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            };
            for(int j=0;j<num1-i-1;j++){
                System.out.print(" ");
            };
            System.out.println("");

        };
        for (int i = 0; i < num1; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            };
            for (int j = 0; j < 2 * num1 - (2 * i + 1); j++) {
                System.out.print("*");
            };

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            };

            System.out.println("");
        };



    };

    public void print10(int num1){
        for(int i=0;i<num1 * 2 - 1;i++){
           for(int j=0;j<=i;j++){
            System.out.print("*");
           };
           System.out.println("");
        };
    };


};

public class Patterns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        PrinterPatterns pattern = new PrinterPatterns();

       
        pattern.print10(num1);

    }

}
