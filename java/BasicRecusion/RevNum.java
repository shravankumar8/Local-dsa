public class RevNum {
    static int Rev(int n){
        if(n==0){
            return n;
        }
        int lastDigit=n%10;
        return Rev(n/10)+lastDigit*10;
    }
    public static void main(String[] args) {
        int n=2343;
        System.out.println(Rev(n));
    }
}
