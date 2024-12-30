package BasicMath;

// a/b
// c/d
public class AdditionFractions {
    static int GCD(int a,int b){
        // using euclideans number
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }
    static int LCM(int b,int d){
       int LCM =b*d/GCD(b,d);
       return LCM;


    }
    static void Fractions(int a,int b, int c,int d){
        // step 1 find the common denomonitor of both denoominators 
        int commonDenominator=LCM(b, d);
        int finalNumerator=0;
        System.out.println();

        int adjustedNumerator1 = a * (commonDenominator / b);
        int adjustedNumerator2 = c * (commonDenominator / d);
         finalNumerator = adjustedNumerator1 + adjustedNumerator2;

         int gcd = GCD(finalNumerator, commonDenominator);
         finalNumerator /= gcd;
         commonDenominator /= gcd;
         System.out.println("SUM "+finalNumerator+"/"+commonDenominator);
      
        
        System.out.println(finalNumerator +"/"+ commonDenominator);



    }
    public static void main(String[] args) {
        Fractions(1,5,3,15);
    }
}
