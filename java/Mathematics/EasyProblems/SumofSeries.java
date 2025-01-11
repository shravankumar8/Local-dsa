public class SumofSeries {
    static void Summer(int n){
        int sum=0;
       
       for(int i=1;i<=n;i++){
        int kg=i*2-1;
        sum+=kg*kg;
      
       }
       System.out.println((n * (2 * n + 1) * (2 * n - 1)) / 3);
    }
    public static void main(String[] args) {
        Summer(10);
      
    }
}
