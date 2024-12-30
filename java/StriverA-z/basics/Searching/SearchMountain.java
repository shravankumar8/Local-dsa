public class SearchMountain {
    static int Search(int[] arr, int target) {
        // the algorithsm is simple man but just use binary search right
        // see we have two kid oof arrays in this aray on which is increasing and one
        // whiich is
        // is decressing find the peak then apply binary search on left half if found
        // return else binary search on right half
        int peak=findPeak(arr);
        int left=0;
        int result=-1;
        result=ASC(  arr,0,peak,  target);
        if(result==-1){
            result=DSC(arr, peak,  arr.length-1, target);
        }
        return result;

    }

    static int DSC(int[] arr, int low, int high, int target) {
        int mid = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return DSC(arr, low, mid - 1, target);
        }
        return DSC(arr, mid + 1, high, target);

    }
    static int ASC(int[] arr, int low, int high, int target) {
        int mid = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return ASC(arr, mid + 1, high, target);
        }
        return ASC(arr, low, mid - 1, target);

    }

    static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        return low;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 2, 1};
        System.out.println(Search(arr,3));
        // System.out.println(Search(arr, 3));
    }
}
