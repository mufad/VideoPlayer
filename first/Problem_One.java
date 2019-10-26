package problem_one;

import java.util.Arrays;


public class Problem_One {
    public static void main(String[] args) {

        String firstString = "eat";
        String secondString = "tar";
        char firstStringArray[] = firstString.toCharArray();
        char secondStringArray[] = secondString.toCharArray();

        if (checkAnagram(firstStringArray, secondStringArray)) {
            System.out.println("These strings are anagrams");
        } else {
            System.out.println("These strings are not anagrams");
        }
    }

    static boolean checkAnagram(char[] str1, char[] str2) {

        if (str1.length != str2.length) {
            return false;
        } else {
            Arrays.sort(str1);
            Arrays.sort(str2);
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] != str2[i])
                    return false;
            }
        }
        return true;
    }
}
