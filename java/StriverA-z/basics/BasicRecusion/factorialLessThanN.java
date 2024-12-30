import java.util.ArrayList;
public class factorialLessThanN {
     static ArrayList<Long> Fact(long n){
        ArrayList<Long>list=new ArrayList<>();
        long Factorial=1;
        int i=1;
        while(Factorial<=n){
            list.add(Factorial);
            i++;
            Factorial*=i;

        }
        return list;
    }
    public static void main(String[] args) {
       System.out.println( Fact(1000));
    }
    
}
