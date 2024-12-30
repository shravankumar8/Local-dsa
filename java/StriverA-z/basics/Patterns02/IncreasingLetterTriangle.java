public class IncreasingLetterTriangle {
    static void Pattern(int n){
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+i;ch++){
                System.out.print(ch+"");

            }
            System.out.println("");
        }

    }
    
    public static void main(String[] args) {
        Pattern(5);
    }
}
