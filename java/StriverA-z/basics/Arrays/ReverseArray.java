import java.util.Arrays;

public class ReverseArray {
static void Rev(int[] arr){
  int i=0;
  int j=arr.length-1;
  while(i<=j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
  }
}
public static void main(String[] args) {
    int[] arr={1,2,23,9,5,7};
    Rev(arr);
    System.out.println(Arrays.toString(arr));
    
}
    
}