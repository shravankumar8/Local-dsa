public class Dectobiin {
    static void Dec(int n){
        if(n<1){
            return;
        }
        Dec(n/2);
       
        System.out.print(n%2+" ");
    }
    public static void main(String[] args) {
        Dec(20);
    }
}
