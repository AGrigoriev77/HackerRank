package hackerRank.String.caesarCipher;

public class Solution {

    private static char encryptChar(char c, int k) {
        if (Character.isAlphabetic(c)) {
            k = k % 26;
            char cryptChr = (char) (c + k);
            if (((Character.isLowerCase(c)) && cryptChr > 'z')
                    || ((Character.isUpperCase(c)) && cryptChr > 'Z')) return (char) (c - (26 - k));
            else return cryptChr;
        } else return c;
    }

    private static String caesarCipher(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(encryptChar(s.charAt(i), k));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "Hello_World!";
        int k = 4;
        String result = caesarCipher(s, k);
        System.out.println(result);
        System.out.println("Lipps_Asvph!");

    }
}