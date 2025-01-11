public class NameNtimes {
    static void Printer(int n, String name){
        if(n<1){
            return ;
        }
        System.out.println(name);
        Printer(n-1,name);
    }
    public static void main(String[] args) {
        Printer(5, "Shravan");
    }
    
}
