public class OnetoN {
    
    static void Printer(int n){
        if(n<1){
            return ;
        }
        Printer(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Printer(5);
    }
}
