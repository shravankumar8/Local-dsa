public class SielingOfNum {
    static int Search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        if(target>arr[arr.length-1 ]|| target<arr[0]){
            return -1;
        }
        
        while (high>low) {
           int mid= low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return arr[low-1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 15, 18, 23, 56 };
    //    cieling 
        int a = Search(arr, 0);
        System.out.println(a);
    }
}
