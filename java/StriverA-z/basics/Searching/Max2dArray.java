import java.util.Arrays;

public class Max2dArray {

    static int[] SearchElement(int[][] arr) {
        int min = 0;
        int[] minA = new int[3];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min) {

                    minA[0] = arr[row][column];
                    minA[1] = row;
                    minA[2] = column;

                }

            }

        }
        return minA;

    }

    public static void main(String[] args) {
        int[][] arr = {

                { 8, 9, 10, 11, 12, 16, 19 },
                { 7, 8, 9, 54, 76, 13, 68, 13 },
                { 5, 45, 345, 6, 5, 76, 5, 4, 2, 3 },
                { 63, 4, 23, 4, 56, 7, 86, 423, 2, 45, 6 }
        };

        int[] result = SearchElement(arr);
        System.out.println(Arrays.toString(result));

    }
}
