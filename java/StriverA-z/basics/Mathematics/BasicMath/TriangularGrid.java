package BasicMath;
// Triangular Numbers

// A number is termed a triangular number if we can represent it in the form of a triangular grid of points such that the points form an equilateral triangle and each row contains as many points as the row number, i.e., the first row has one point, second row has two points, third row has three points and so on. The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).
 

// triangular
// How to check if a number is Triangular? 
// The idea is based on the fact that n’th triangular number can be written as sum of n natural numbers, that is n*(n+1)/2. The reason for this is simple, base line of triangular grid has n dots, line above base has (n-1) dots and so on.

// Method 1 (Simple) 
// We start with 1 and check if the number is equal to 1. If it is not, we add 2 to make it 3 and recheck with the number. We repeat this procedure until the sum remains less than or equal to the number that is to be checked for being triangular.
// Following is the implementations to check if a number is triangular number. 
// Below is the implementation of above approach
public class TriangularGrid {
    static boolean Grid(int num){
        int sum=0;
        for(int i=1;i<=num;i++){

            sum=sum+i;
            if(sum==num){
                return true;
                
            }

        }
        return false;
    }

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i+" "+Grid(i));
        }
        
    }
}
