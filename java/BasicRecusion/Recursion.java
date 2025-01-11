
import java.util.Scanner;


class Functions{
    void print1(int i,int n){
       if(i<1){
         return;
       }
       print1(i-1,n);
       System.out.print(i+" ");
    };
   void print2(int i, int sum){
    // prints the sum from 1 to n using parameteriized shit Recursion
    if(i<1){
        System.out.println(sum);
        return;
    };
    print2(i-1,sum+i);

   }
   int print3(int n){
    // prints the sum from 1 to n using Recursion this is functional recursion 
    if(n==0){
        
        return 0;
    }
    return n+print3(n-1);

   }
}

public class Recursion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i=input.nextInt();
      
        Functions f = new Functions();
        System.out.println(f.print3(i));
    }
    
}



