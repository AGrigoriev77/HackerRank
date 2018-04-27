package hackerRank.String.WeightedUniformStrings;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    private static String[] weightedUniformStrings(String s, int[] queries) {

        Map<String, Long> frequentChars = Arrays.stream(
                s.toLowerCase().split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));



    }

    public static void main(String[] args) throws IOException {

        String s = "abccddde";
        int[] queries = new int[]{6, 1, 3, 12, 5, 9, 10};

        String[] result = weightedUniformStrings(s, queries);

        for (String aResult : result) {
            System.out.println(aResult);
        }

    }
}