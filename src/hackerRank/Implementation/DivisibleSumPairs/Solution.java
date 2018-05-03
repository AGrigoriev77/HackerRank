package hackerRank.Implementation.DivisibleSumPairs;

import java.util.stream.IntStream;

public class Solution {

    private static int count = 0;

    private static int divisibleSumPairs(int n, int k, int[] ar) {

        IntStream.range(0, ar.length)
                .forEach(i -> IntStream.range(i + 1, ar.length)
                        .filter(j -> (ar[i] + ar[j]) % k == 0)
                        .forEach(x -> count++)
                );

        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] ar = new int[]{1, 3, 2, 6, 1, 2};
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}