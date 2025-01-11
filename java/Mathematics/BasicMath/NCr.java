public class NCr {
    static int Factorial(int n) {
        if (n == 1||n==0) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    static int BinomialCoef(int n, int r) {
        if (r > n) {
            return 0;

        }

        return (Factorial(n) / (Factorial(r) * Factorial(n - r)));

    }

    public static void main(String args[]) {
        System.out.println(BinomialCoef(21, 16));

    }
}
