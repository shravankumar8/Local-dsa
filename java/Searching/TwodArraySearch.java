import java.util.Arrays;

public class TwodArraySearch {
    static int[] SearchElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] { row, column };

                }

            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 6, 7, 13, 14 },
                { 8, 9, 10, 11, 12, 16, 19 },
                { 7, 8, 9, 54, 76, 13, 68, 13 },
                { 5, 45, 345, 6, 5, 76, 5, 4, 2, 3 },
                { 63, 4, 23, 4, 56, 7, 86, 423, 2, 45, 6 }
        };
        int target = 6;
        int[] Result = SearchElement(arr, 6);
        System.out.println(Arrays.toString(Result));

    }
}
