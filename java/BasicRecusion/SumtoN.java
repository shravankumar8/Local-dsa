public class SumtoN {
    static int Summer(int n,int sum){
            if(n<1){
                return 0;
            }
           
            return n+Summer(n-1, sum=sum+n);
    }
    static int Sum(int n){
        if(n<1){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Summer(5,0));
        System.out.println(Sum(5));
    }
}
