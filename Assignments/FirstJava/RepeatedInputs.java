import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatedInputs {
    
    static int Fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        int input;
        while (true) {
            System.out.print("please input a number :");
            input=in.nextInt();
            if(input==0){
                int max=list.get(input);
                for(int i=0;i<list.size();i++){
                    if(list.get(i)>max){
                        max=list.get(i);
                    }
                }
                System.out.println(max);


                break;
            }
            list.add(input);
           
        }
    }
}
