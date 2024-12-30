package BasicMath;
// Program for N-th term of Arithmetic Progression

// Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nthterm of the series.
// Examples :

// Input : a = 2 d = 1 N = 5
// Output : 6
// The 5th term of the series is 6. The terms are 2, 3, 4, 5, 6, ….

// Input : a = 5 d = 2 N = 10
// Output : 23
// The 10th term of the series is : 23
public class NthtermofGP {
    static int Progresser(int a,int d ,int n){
     int nthterm=a;
     for(int i=1;i<n;i++){
        nthterm=nthterm+d;
     }
return nthterm;

    }
    public static void main(String[] args) {
        System.out.println("output "+Progresser(5,2,10));
    }

    
}
