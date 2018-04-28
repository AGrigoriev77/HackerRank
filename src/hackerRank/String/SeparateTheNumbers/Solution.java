package hackerRank.String.SeparateTheNumbers;

public class Solution {

    private static void separateNumbers(String s) {

        boolean isBeautiful = false;
        long startNumber = Long.MIN_VALUE;

        for (int i = 1; i <= s.length() / 2; i++) {
            long currentNumber = Long.parseLong(s.substring(0, i));
            startNumber = currentNumber;

            StringBuilder sb = new StringBuilder(Long.toString(currentNumber));
            while (sb.length() < s.length()) {
                sb.append(Long.toString(++currentNumber));
            }
            if (sb.toString().equals(s)) {
                isBeautiful = true;
                break;
            }
        }
        System.out.println(isBeautiful ? "YES " + startNumber : "NO");

    }

    public static void main(String[] args) {
        String s = "1234567";
        separateNumbers(s);
    }
}