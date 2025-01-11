public class Digitalroot {
    static int Rooter(int n){
       int sum=0;
    
        while( n>0||sum>9){
            if(n==0){
                n=sum;
                sum=0;
                
            }
            sum+=n%10;
            n /= 10;

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Rooter(65785412));
    }
    
}
