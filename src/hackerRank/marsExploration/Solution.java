package hackerRank.marsExploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int marsExploration(String s) {
        String expectedMessage = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i += expectedMessage.length()) {
            String recievedMessage = s.substring(i, Math.min(s.length(), i + expectedMessage.length()));
            if (!recievedMessage.equals(expectedMessage)) {
                char[] chars = recievedMessage.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] != expectedMessage.toCharArray()[j]) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";
        int result = marsExploration(s);
        System.out.println(result);

    }
}