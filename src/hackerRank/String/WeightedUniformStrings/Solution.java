package hackerRank.String.WeightedUniformStrings;

import java.util.HashSet;

public class Solution {

    private static int getWeight(String s) {
        return Character.getNumericValue(s.charAt(0)) - 9;
    }


    private static String[] weightedUniformStrings(String s, int[] queries) {

        HashSet<Integer> weightSet = new HashSet<>();
        int weight = 0;
        char lastChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != lastChar) weight = 0;
            weight += currentChar - 'a' + 1;
            weightSet.add(weight);
            lastChar = currentChar;
        }

        String[] listConsists = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            listConsists[i] = weightSet.contains(queries[i]) ? "Yes" : "No";
        }

        return listConsists;
    }

    public static void main(String[] args) {

        String s = "abccddde";
        int[] queries = new int[]{1, 3, 12, 5, 9, 10};

        String[] result = weightedUniformStrings(s, queries);

        for (String aResult : result) {
            System.out.println(aResult);
        }

    }
}