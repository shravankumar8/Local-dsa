public class OrderAgnosticBN {
    static int Search(int[] arr, int target) {
        if(arr[0]<arr[arr.length-1]){

            return ASC(arr,0,arr.length-1,target);
        }
        return ASC(arr, 0, arr.length - 1, target);


    }

    static int ASC(int[] arr, int low, int high, int target) {
        int mid = low+(high-low)/2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if(target>arr[mid]){
          return ASC( arr,  mid+1,  high,  target);
        }
        return ASC(arr, low, mid-1, target);


    }
    static int DSC(int[] arr, int low, int high, int target) {
        int mid = low+(high-low)/2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if(target>arr[mid]){
          return DSC( arr,  low,  mid-1,  target);
        }
        return DSC(arr, mid+1, high, target);


    }

    public static void main(String[] args) {
       
        int[] arr2={1, 3, 5, 7, 9, 11, 13};
       int a= Search(arr2, 11);
       System.out.println(a);
    }
}
