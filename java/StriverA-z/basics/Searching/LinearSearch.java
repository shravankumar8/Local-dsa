public class LinearSearch {
    static int Search(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr={234,3,34,323,43,4,32,34,3,4,323,43,4};
       System.out.println( Search(arr,34));
        
    }
}
