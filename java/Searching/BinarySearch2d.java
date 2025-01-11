import java.util.Arrays;

public class BinarySearch2d {
    static int[] Search(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;
        while (r<arr.length && c>0) {
            if(arr[r][c]==target){
              return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
            
        }
        return new int[] { -1, -1 };
    }
        public static void main(String[] args) {
            int[][] arr= new int[][]{
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,47},
                {33,34,39,50}

            };
            System.out.println(Arrays.toString(Search(arr, 37)));
        
    }
}
