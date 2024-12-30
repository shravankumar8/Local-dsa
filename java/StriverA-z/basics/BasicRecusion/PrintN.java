public class PrintN {

    static void Printer(int n){
        if(n<=0){
            return ;
        }else{
            Printer(n-1);
        }
        System.out.print(n+ " ");

    }
    public static void main(String[] args) {
        Printer(5);
    }
}