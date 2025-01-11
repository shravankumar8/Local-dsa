// Sum of the sequence 2, 22, 222, ………
// Last Updated : 12 Dec, 2024
// Given an integer n. The task is to find the sum of the following sequence: 2, 22, 222, ……… to n terms. 

// Examples : 

// Input: n = 2
// Output: 24
// Explanation: For n = 2, the sum of first 2 terms are 2 + 22 = 24

// Input: 3
// Output: 246
// Explanation: For n = 3, the sum of first 3 terms are 2 + 22 + 222 = 246

public class Sumofsequence {

    static void Summer(int n) {
        int indexdes = 2;
        int summation = 0;

        for (int i = 0; i < n; i++) {
            summation = summation + indexdes;
            indexdes = indexdes * 10 + 2;

        }
        System.out.println(summation);

    }

    public static void main(String[] args) {
        Summer(3);

    }

}
