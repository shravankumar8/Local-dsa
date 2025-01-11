public class SumSqrsCubs {
    
    static void Solver(int n){
     
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=i*i*i+i*i;


        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Solver(4);
    }
}
