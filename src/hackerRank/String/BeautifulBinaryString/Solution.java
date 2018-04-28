package hackerRank.String.BeautifulBinaryString;

public class Solution {

    private static int beautifulBinaryString(String b) {
        return b.length() - b.replace("010", "10").length();
    }

    public static void main(String[] args) {
        String b = "0101010";
        int result = beautifulBinaryString(b);
        System.out.println(result);
    }
}