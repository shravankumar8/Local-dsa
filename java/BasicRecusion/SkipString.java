public class SkipString {

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }

    static String skipApp(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApp(up.substring(5));
        } else {
            return up.charAt(0) + skipApp(up.substring(1));
        }

    }

    public static void main(String[] args) {
        String str = "kajalapphf ";
        str = skipApp(str);

        System.out.println(str);

    }
}
