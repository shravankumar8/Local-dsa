import java.util.Arrays;

public class Dupl {
    static int Duplicates(int[] arr){
        int j=1;
       for(int i=1;i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
           arr[j]=arr[i];
            j++;
        }
       }
       System.out.println(Arrays.toString(arr));
       return j;

    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(Duplicates(arr));

        

    }
    
}