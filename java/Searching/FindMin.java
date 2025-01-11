public class FindMin {
    static int Search(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }


        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 234, 3, 34, 323, 43, 4, 32, 34, 3, 4, 323, 43, 4 };
        System.out.println(Search(arr));


    }
}
