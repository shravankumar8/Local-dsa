import java.util.Arrays;

public class MergeSort {
    static int[] Sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = Sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] list = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                list[k] = first[i];
                i++;
            } else {
                list[k] = second[j];
                j++;
            }
            k++;
        }
        while (i<first.length) {
            list[k]=first[i];
            i++;
            k++;
            
        }
        while (j<second.length) {
            list[k]=second[j];
            j++;
            k++;
            
        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
