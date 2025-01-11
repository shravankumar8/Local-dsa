import java.util.ArrayList;

public class Dice {
    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String > list = new ArrayList<>();
            list.add(p);

            return list;
        }
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
           arr.addAll( dice(p + i, target - i));
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println( dice("", 4));
       
    }
}
