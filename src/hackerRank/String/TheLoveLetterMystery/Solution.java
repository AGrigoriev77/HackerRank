package hackerRank.String.TheLoveLetterMystery;

public class Solution {

    private static int theLoveLetterMystery(String s) {

        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            count += Math.abs(s.charAt(i) - s.charAt(s.length() - 1 - i));
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "abcd";
        int result = theLoveLetterMystery(s);
        System.out.println(result);

    }
}