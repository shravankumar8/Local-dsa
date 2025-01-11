import java.util.ArrayList;
import java.util.Arrays;

public class miissingNumbers {

    static ArrayList<Integer> Search(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                // swap
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;


            }else{
                i++;
            }


        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> list= Search(arr);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
       
    }

}
