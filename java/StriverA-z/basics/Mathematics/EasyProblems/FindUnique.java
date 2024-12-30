import java.util.Scanner;
public class FindUnique {
    static int Checke(int[] n){
        int Unique=0;
        for(int num:n){
            Unique ^= num;
        }
    return Unique;
    }
    public static void main(String[] args) {
       int[] arr={2,3,3,4,2,6,4};
        
        System.out.println(Checke(arr));
        
    }
}
