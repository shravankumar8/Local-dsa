public class BinaryNumberTriangle {
    static void Pattern(int n){
        for(int i=0;i<n;i++){
            int start=1;
            if(i%2==0) start=1;
            else start=0;
            for(int k=0;k<=i;k++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println("");




        }

    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}
