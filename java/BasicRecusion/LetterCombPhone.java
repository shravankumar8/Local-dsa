import java.util.ArrayList;

public class LetterCombPhone {
    static void pppp(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int j = (digit - 1) * 3; j < digit * 3; j++) {
            char ch = (char) ('a' + j);
            pppp(p + ch, up.substring(1));

        }
    }

    public static void main(String[] args) {
        pppp("", "12");
    }
}
