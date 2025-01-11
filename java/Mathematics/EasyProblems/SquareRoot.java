public class SquareRoot {
    static double sqrt(int n) {
        int result = 1;
        int i = 1;

        if (n == 0 || n == 1) {
            return n;

        }
        while (result <= n) {
            i++;
            result = i * i;

        }

        return i - 1;

    }

    public static void main(String[] args) {

        System.out.println(sqrt(11));
    }
}
