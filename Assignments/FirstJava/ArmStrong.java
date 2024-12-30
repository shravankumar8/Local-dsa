public class ArmStrong {
    static boolean Checker(int n){
        int number=n;
        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
            sum+=Math.pow(lastDigit, 3);
            n/=10;
            
        }
        if(number==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(Checker(154));
        
    }

}
