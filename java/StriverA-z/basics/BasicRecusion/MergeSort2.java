import java.util.Arrays;

public class MergeSort2 {
    static void Sort(int[] arr,int s, int e) {
        if (e-s == 1) {
            return ;
        }
        int mid = (s + e) / 2;
        Sort(arr, s, mid);
         Sort(arr, mid, e);
       merge(arr,s,mid,e);
    }

    static void merge(int[] arr, int s, int mid, int e) {
        int[] list = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                list[k] = arr[i];
                i++;
            } else {
                list[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            list[k] = arr[i];
            i++;
            k++;

        }
        while (j < e) {
            list[k] = arr[j];
            j++;
            k++;

        }
       for(int l=0;l<list.length;l++){
        arr[s+l]=list[l];
       }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
    Sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
