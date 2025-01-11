public class RotatedBinarySearch {
    static int Search(int[] arr, int low ,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if (target==arr[mid]) {
            return mid;
            
        }
        if(arr[low]<=arr[mid]  ){
            if(target >= arr[low] && target<arr[mid]){
               return Search(arr, low, mid-1, target);
            }else{
                return Search(arr, mid+1, high, target);

            }
        }else{
            if(target>arr[mid]&& target<=arr[high]){
                return Search(arr, mid + 1, high, target);
            }else{
                return Search(arr, low, mid - 1, target);
            }
        }
        
    }
        public static void main(String[] args) {
        int [] arr={5,6,7,8,9,1,2,3};
        System.out.println( Search( arr,0,arr.length-1,2));

    }
}
