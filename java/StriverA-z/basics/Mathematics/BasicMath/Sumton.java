package BasicMath;
import java.util.Scanner;
// Program to find sum of first n natural numbers
// Input: n = 3
// Output: 6
// Explanation: Note that 1 + 2 + 3 = 6

// Input  : 5
// Output : 15 
// Explanation : Note that 1 + 2 + 3 + 4 + 5 = 15
public class main {
   

    static int findSum(int num){
        int sum=0;
        for(int i=0;i<num;i++){
            sum=sum+i;
        }
        return sum;


    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter an Integer");
         int userInput=input.nextInt();
         int sum=findSum(userInput);
         System.out.println("the sum for that number is "+ sum);



        
       

    }
    
    
}
