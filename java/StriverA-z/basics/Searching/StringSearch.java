
import java.util.Arrays;

public class StringSearch {
    static int Search(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;

    }

    static int SearchRange(int[] arr, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name = "Shravan";
        char target = 'v';
        // System.out.println(Search(name,target));
        System.out.println(Search(name, target));
        // Print String Array
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
