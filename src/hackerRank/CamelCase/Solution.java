package hackerRank.CamelCase;

import java.util.*;

public class Solution {

    private static int camelcase(String s) {
        long counter = s.chars().filter(Character::isUpperCase).count();
        return (int)counter + 1; // add the first word
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}