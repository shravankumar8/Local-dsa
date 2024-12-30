public class LinearSearch {
    
        static int Search(int[] arr, int target, int index) {
            if(index>arr.length-1){
                return -1;
            }
            if(arr[index]==target){
                return index;
            }

            return Search(arr,target, index+1);
        }

        public static void main(String[] args) {
            int[] arr = { 1, 2, 4, 8, 7, 12,76,3,89,24,84 };
            int target=84;

            System.out.println(Search(arr, target,0));

        }

    
}
