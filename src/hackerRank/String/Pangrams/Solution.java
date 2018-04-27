package hackerRank.String.Pangrams;

import java.util.*;

public class Solution {


    private static String pangrams(String s) {

        HashSet<String> uniqSet = new HashSet<>();
        Arrays.stream(s.toLowerCase().split("")).forEach(chr -> {
            if (Character.isLetter(chr.charAt(0))) uniqSet.add(chr);
        });

        if (uniqSet.size() == 26) return "pangram";
        else return "not pangram";

    }

    public static void main(String[] args) {

        String s = "We promptly judged antique ivory buckles for the next prize   ";
        String result = pangrams(s);
        System.out.println(result);

    }
}