public class LucasNumber {
    static int Lucas(int n){
        if(n==0){
            return 2;
        }
        if(n==1){
            return 1;
        }
        return Lucas(n-1)+Lucas(n-2);

    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(Lucas(i));

        }
    }
    
}
