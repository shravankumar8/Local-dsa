public class PowersofN {
    static int Printer(int n) {
        int k = n;
        int rev = 0;
        while (k > 0) {
            int lastDigit = k % 10;
            rev = rev * 10 + lastDigit;
            k/=10;
        }
        
       
        return (int) Math.pow(n, rev);
    }

    public static void main(String[] args) {
        System.out.println(Printer(3));
        
    }

}
// instead lets do a recussive solution 
