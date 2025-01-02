import java.util.ArrayList;

public class SubSequenceAscci {
 static ArrayList<String> subseqascci(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqascci(p , up.substring(1));
        ArrayList<String> right = subseqascci(p + ch, up.substring(1));
        ArrayList<String> assic = subseqascci(p + (0+ch), up.substring(1));
        left.addAll(right);
        left.addAll(assic);
        return left;

    }

    public static void main(String[] args) {

        ArrayList<String> list = subseqascci("", "abc");

        System.out.println(list);
    }
    
}