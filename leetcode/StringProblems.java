package leetcode;
import java.util.*;

public class StringProblems {
    public static List <String> list = new ArrayList<String> ();

    public static int countSubstrings(String s) {

        for (int i = 0; i < s.length();i++) {
            for (int j = s.length(); j > i; j--) {

            // System.out.println(i + j) ;
                String str = s.substring(i,j);
                if (isPalindrome(str)) {
                    list.add(str);
                }
            }
        }
        System.out.println(Arrays.deepToString(list.toArray()));
        return list.size();
    }

    public static boolean isPalindrome (String inputString) {
        int len = (int) Math.floor(inputString.length()/2);
        for (int i = 0; i < len; i++) {
            String first = inputString.substring(i,i+1);
            String second = inputString.substring(inputString.length()-1-i, inputString.length()-i);
            // System.out.println(first +" " + second) ;
            if (!first.equals(second)) {
                return false;
            }
        }
        return true;
    }
}
