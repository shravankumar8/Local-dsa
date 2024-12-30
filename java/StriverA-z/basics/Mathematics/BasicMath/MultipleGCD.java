package BasicMath;

public class MultipleGCD {
    static int Gcd(int a, int b) {
        
       
        while (a > 0 && b > 0) {
           if(a>b){
            a=a%b;
           }else{
            b=b%a;
           }

        }
        if(a==0){
            return b;

        }
       return a;

    }

    static int Aggregator(int[] arr) {
        int gcd = 0;
        for (int i = 0; i < arr.length; i++) {
          
            gcd = Gcd(gcd, arr[i]);
        }
        return gcd;

    }

    public static void main(String[] args) {
        int  [] arr = {20, 40, 60, 80};
        System.out.println(Aggregator(arr));

    }

}
