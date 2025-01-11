public class RotatedSortedArray {
    static int Search(int[] arr, int target) {
        // in a thing like this the goal is to find the pivot the peak element from
        // which
        // the array starts rotating here the it is 7
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // check if left half is sorted which means
            if (arr[low] <= arr[mid]) {
                // the left half is sorted
                // check the target here if the target might lie in this sorted siide
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                    // do a binary search here from start to arr[mid];

                } else {
                    low = mid + 1;
                }

            }else{
                if(arr[mid]>target && target<arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }

        }
        return -1;

    } 
    // static int findPivot(int[] arr){
    // // how do we find a pivot for the array
    // while(low<=high){
    // // {4,5,6,7,0,1,2};
    // if(arr[mid]>arr[mid+1]){

    // }

    // }
    // }
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7,8, 0, 1, 2 };
        System.out.println(Search(arr, 0));
    }
}