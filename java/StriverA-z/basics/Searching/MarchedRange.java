import java.util.Arrays;
// . Find First and Last Position of Element in Sorted Array
// Given an array of integers nums sorted in non-decreasing order,find the starting and ending position of a given target value.

// If target is not found in the array,return[-1,-1].

// You must write an algorithm with O(log n)runtime complexity.
public class MarchedRange {
    static int FindIndex(int[] nums, int target, Boolean FindStartIndex) {
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {

                ans = mid;
                if (FindStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }

        return ans;

    }

    static int[] FindRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = FindIndex(nums, target, true);
        int end = FindIndex(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(FindRange(nums, 8)));

        // System.out.println(FindRange(nums, 8));

    }
}
