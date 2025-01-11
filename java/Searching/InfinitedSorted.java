public class InfinitedSorted {
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
    static int  Search(int [] arr,int target){

        int start=0;
        int end=1+1;
        while(target>arr[end]){
            start=end;
            end+=end;

        }

       return ASC(arr,start,end,target);

    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43};
        System.out.println(Search(array,26));
    }
}
