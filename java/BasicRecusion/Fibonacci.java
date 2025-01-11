public class Fibonacci {
    
    static int Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;

        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(Fib(i));
        }
    }
}
