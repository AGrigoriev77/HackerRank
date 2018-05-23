package hackerRank.DataStructure.Arrays.ArrayManipulation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Solution {

    private static Long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];

        for (int[] query : queries) {

            int a = query[0] - 1;
            int b = query[1] - 1;
            Long k = (long) query[2];

            arr[a] += k;
            if (b < n) arr[b] -= k;

        }

        long max = 0;
        long temp = 0;

        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp > max) max = temp;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("./easy.txt");

        Scanner scanner = new Scanner(file);

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        Long result = arrayManipulation(n, queries);
        System.out.println(result);
    }
}