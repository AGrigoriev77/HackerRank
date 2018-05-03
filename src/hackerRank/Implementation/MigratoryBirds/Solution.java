package hackerRank.Implementation.MigratoryBirds;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    // Complete the migratoryBirds function below.
    private static int migratoryBirds(int n, int[] ar) {

        Map<Integer, Long> counters = Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return Collections.max(counters.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] ar = new int[]{1, 4, 4, 4, 5, 3};
        int n = 6;

        int result = migratoryBirds(n, ar);
        System.out.println(result);

    }
}
