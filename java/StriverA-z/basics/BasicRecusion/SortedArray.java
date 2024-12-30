public class SortedArray {
    static boolean  Sorter(int[] arr,int index){
        if(arr.length<=1 ||index>=arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]  && Sorter( arr, index+1);

    }
public static void main(String[] args) {
    int[] arr={1,2,4,8,7,12};
   System.out.println( Sorter(arr,0));


}
    
}