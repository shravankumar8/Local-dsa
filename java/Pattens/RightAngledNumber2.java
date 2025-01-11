public class RightAngledNumber2 {
    static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Pattern(5);
    }
}
