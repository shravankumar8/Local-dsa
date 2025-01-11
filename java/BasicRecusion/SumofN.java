public class SumofN {
    static int  Printer(int n,int sum){
        if(n<1){
           
            return sum ;
        }
        System.out.println(Math.log10(n) + 1);
        return Printer(n-1, sum+n);


    }
    public static void main(String[] args) {
        System.out.println(Printer(10, 0));
    }
}
