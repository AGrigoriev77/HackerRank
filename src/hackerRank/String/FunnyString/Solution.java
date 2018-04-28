package hackerRank.String.FunnyString;

import java.util.Arrays;

public class Solution {

    private static int getDifference(char chr1, char chr2) {
        return Math.abs(Character.getNumericValue(chr2) - Character.getNumericValue(chr1));
    }

    private static int[] getDifference(String str) {
        int[] diff = new int[str.length() - 1];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            diff[i] = getDifference(charArray[i], charArray[i + 1]);
        }
        return diff;
    }

    private static String funnyString(String s) {

        int[] diffOriginalString = getDifference(s);
        int[] diffRereverseString = getDifference(
                new StringBuilder(s).reverse().toString());

        return (Arrays.equals(diffOriginalString, diffRereverseString)) ? "FUNNY" : "NOT FUNNY";

    }

    public static void main(String[] args) {
        String s = "bcxz";
        String result = funnyString(s);
        System.out.println(result);
    }
}