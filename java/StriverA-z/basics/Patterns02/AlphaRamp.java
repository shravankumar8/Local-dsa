public class AlphaRamp {
    static void Pattern(int n){
        for(int i=0;i<n;i++){
           
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i));
                
                
                
            }
            System.out.println("");
            
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
