public class Sumoftheseries {
    static void Summer(int n){
        double sum=0;
        double state=0.6;
        for(int i=1;i<=n;i++){
           
            sum=sum+state;
            state=state/10;
        }
       
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Summer(4);
    }
    
}
