public class BinarySearch {
    static int Search(int[] arr, int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
           return Search(arr,  target, mid+1, high) ;
           
        }
            return Search(arr, target,low,mid-1);
            
        

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Search(arr, 2, 0, arr.length-1));
    }
}
