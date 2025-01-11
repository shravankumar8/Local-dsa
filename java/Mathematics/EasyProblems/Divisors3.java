public class Divisors3 {
    static void Solver(int n) {
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    // System.out.println(i+" "+j);
                }

            }
            if (count == 3) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Solver(49);
    }

}
