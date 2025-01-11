import java.util.ArrayList;

public class MergeSort {
    static void Sort(int[] arr, int low, int mid, int high) {
        // this guys here compares the elements from one array[low,mid] and the another
        // array[mid+1,high]

        // this is where the soorthing happens foor the merge sort
        ArrayList<Integer> List = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                List.add(arr[left]);
                left++;

            } else {
                List.add(arr[right]);
                right++;
            }

        }
        while (left <= mid) {
            List.add(arr[left]);
            left++;

        }
        while (right <= high) {
            List.add(arr[right]);
            right++;

        }
        for(int i=low;i<=high;i++){
            arr[i]=List.get(i-low);
        }
    }

    static void Merger(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        Merger(arr, low, mid);
        Merger(arr, mid + 1, high);
        Sort(arr, low, mid, high);

    }
    public static void main(String[] args) {
        int [] arr={ 3, 2, 8, 5, 1, 4, 23};
        Merger(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

    }
}}
