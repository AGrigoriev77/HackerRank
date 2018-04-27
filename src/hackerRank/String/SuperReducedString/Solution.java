package hackerRank.String.SuperReducedString;

import java.util.*;

public class Solution {

    private static Stack<String> stack = new Stack<>();

    private static void reduce(String chr){
        if (!stack.isEmpty() && chr.equals(stack.peek())) stack.pop();
        else stack.push(chr);
    }

    private static String super_reduced_string(String s){

        StringBuilder sb = new StringBuilder();
        Arrays.stream(s.split("")).forEach(Solution::reduce);

        if (stack.isEmpty()) sb.append("Empty String");
        else stack.forEach(sb::append);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}