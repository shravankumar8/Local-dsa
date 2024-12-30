public class Fibonacci {
    static int Fibb(int n){

        if(n<=1){
            return n;
        }
        return Fibb(n-1)+Fibb(n-2);

    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(" "+Fibb(i));

        }
    }
    
}
