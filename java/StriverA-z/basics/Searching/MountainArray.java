public class MountainArray {
    static int PeakELement(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
       
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // peak is on the right side
                // check for the right side
                left = mid + 1;

            } else {
                right = mid;
            }
           

        }
        return left;

    }
    public static void main(String[] args) {
        
        int[] arr={0,10,12,5,2};
        System.out.println(PeakELement(arr));
    }

}
