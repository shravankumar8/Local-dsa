public class StarPyramid {
    static void Pattern(int n){
        // we are printing spaces 
        for(int i=0;i<n;i++){
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print( "*");
            }
            for (int l = n; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.println("");
        }
           
            // here we need to priint the number of stars
            
        
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
