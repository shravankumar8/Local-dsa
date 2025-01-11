// Program to find Nth term of given Geometric Progression

// Given the first term a, common ratio r, and an integer N of a Geometric Progression (GP) series, the task is to find the N-th term of the series.

// Examples:

//  Input:  a=2, r=2, N=4 
//  Output:  The 4th term of the series is: 16 
//  Explanation:  The series is 2, 4, 8, 16, … The 4th term is 16. 


//  Input: a = 2, r = 3, N = 5 
//  Output:  The 5th term of the series is: 162 
//  Explanation:  The series is 2, 6, 18, 54, 162, … The 5th term is 162. 
package BasicMath; 
public class Basic4 {
    static int geoProg(int a ,int r ,int n){
        int geo=a;
        for(int i=1;i<n;i++ ){
        geo=geo*r;
    }

    return geo;
    }
public static void main(String[] args) {
   
  
    
    System.out.println(geoProg(2,2,4));
}
    
}