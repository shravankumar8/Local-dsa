import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {
    // Given two arrays a[] and b[], the task is to find the number of elements in
    // the union between these two arrays.

    // The Union of the two arrays can be defined as the set containing distinct
    // elements from both arrays. If there are repetitions, then only one element
    // occurrence should be there in the union.

    // Note: Elements of a[] and b[] are not necessarily distinct.
    

    static int Union(int[] arr1, int[] arr2) {
        HashSet<Integer> hash= new HashSet<>();
       for(int element : arr1){
        hash.add(element);
       }
       for(int element : arr2){
        hash.add(element);
       }

       
      return hash.size();

       
    }
      

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 1, 1, 2 };
        int[] arr2 = { 2, 2, 1, 2, 1 };
        System.out.println(Union(arr1, arr2));

    }
}