package hackerRank.twoCharacters;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    private static boolean isNotValid;

    private static boolean checkValid(String str) {
        isNotValid = false;
        Stack<String> stack = new Stack<>();
        Arrays.stream(str.split("")).forEach(chr -> {
            if (!stack.isEmpty() && chr.equals(stack.peek())) {
                isNotValid = true;
            } else stack.push(chr);
        });
        return isNotValid;
    }

    private static int twoCharaters(String s) {

        int maxLength = 0;
        HashSet<String> uniqSet = new HashSet<>(Arrays.asList(s.split("")));
        if (uniqSet.size() == 1) return 0;
        if (uniqSet.size() == s.length()) return s.length();
        List<String> uniqList = new ArrayList<>(uniqSet);
        for (int i = 0; i < uniqList.size(); i++) {
            for (int j = i + 1; j < uniqList.size(); j++) {
                ArrayList<String> removeList = new ArrayList<>(uniqList);
                removeList.removeIf(uniqList.get(i)::equals);
                removeList.removeIf(uniqList.get(j)::equals);

                String testingString = s;
                for (String removeChr : removeList) {
                    testingString = testingString.replace(removeChr, "");
                }

                if (!checkValid(testingString)) {
                    if (maxLength < testingString.length()) {
                        maxLength = testingString.length();
                    }
                }
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "cobmjdczpffbxputsaqrwnfcweuothoygvlzugazulgjdbdbarnlffzpogdprjxvtvbmxjujeubiofecvmjmxvofejdvovtjulhhfyadr";
        int result = twoCharaters(s);
        System.out.println(result);
    }
}
