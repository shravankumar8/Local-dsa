import java.util.ArrayList;

public class DupLinearSearch {
    static ArrayList<Integer> Search(int[] arr,ArrayList<Integer> list ,int target, int index) {
        if (index > arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
             list.add(index);
        }

        return Search(arr, list,target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,1,4,4,5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(Search(arr,list, target, 0));

    }

}
