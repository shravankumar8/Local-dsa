public class PairCubeCount {
// Given n, count all‘a’and‘b’
//     that satisfy
//     the condition a^3+b^3=n.Where(a,b)

//     and (b, a) are considered two different pairs

// Examples: 

// Input: n = 9
// Output: 2
// Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9


// Input: n = 28
// Output: 2
// Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28


// Try it on GfG Practice
// bruteforcefully find what 2 numbers on cube multiplied gives the original number n

    static int Counter(int n) {
        int count = 0;
        for (int i = 1; i < Math.cbrt(n); i++) {
            for (int j = 1; j < Math.cbrt(n); j++) {
                int cb = i * i * i;
                int kb = j * j * j;

                if (cb + kb == n) {
                    count = count + 1;

                }

            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Counter(28));
    }
}