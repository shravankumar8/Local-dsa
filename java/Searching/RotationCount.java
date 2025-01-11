public class RotationCount {
    static int findPivot(int[] arr){
        // returns the no of  rotation 
        int low=0;
        int end=arr.length-1;
        while (low<=end) {
            int mid=low+(end-low)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>low&& arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[low]){
                end=mid-1;
            }else{
                low=mid+1;
            }

            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(findPivot(arr));
    }
}
