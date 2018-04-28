package hackerRank.String.AlternatingCharacters;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private static int counter;

    private static int alternatingCharacters(String s) {
        Stack<String> stack = new Stack<>();
        counter = 0;
        Arrays.stream(s.split("")).forEach(chr -> {
            if (!stack.isEmpty() && chr.equals(stack.peek())) counter++;
            else stack.push(chr);
        });
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}