public class PrintNtimes {
    static void Printer(int n,String str){
        if(n<=0){
            return;
        }else{
            Printer(n-1, str);
        }
        System.out.print(str+" ");
    }
    public static void main(String[] args) {
        Printer(5, "GFG");
    }
    
}
