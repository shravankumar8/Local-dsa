package BasicMath;

public class CoPrimes {

    static int Coprimes(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return Coprimes(a-b, b);
        }else{
            return Coprimes(a, b - a);
        }
       
       

     


    }
    public static void main(String[] args) {
       System.out.println( Coprimes(4,8));
        
    }
}
