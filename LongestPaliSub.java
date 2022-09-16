import java.util.*;

public class LongestPaliSub {
    // before short
    // would be time limit exceeded if string too long
    public String longestPalindromeI(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        HashMap<Integer, String> map = new HashMap<>();
        int maxLength = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            int start = i, end = s.length() - 1;
            while (!check && (start < end)) {
                int tempstart = start, tempend = end;
                while (s.charAt(tempstart) == s.charAt(tempend) && tempstart < tempend) {
                    tempstart++;
                    tempend--;
                    if (tempend <= tempstart && s.charAt(tempstart) == s.charAt(tempend)) {
                        maxLength = Math.max(maxLength, s.substring(start, end + 1).length());
                        map.put(s.substring(start, end + 1).length(), s.substring(start, end + 1));
                    }
                }
                end--;
            }
        }
        if (maxLength == 0) {
            return s.substring(0, 1);
        }
        return map.get(maxLength);
    }

    // after short
    public String longestPalindromeII(String s) {
        String maxSubLength = "";
        for (int i = 0; i < s.length(); i++) {
            String sub1 = palindromSubstr(s, i, i);
            String sub2 = palindromSubstr(s, i, i + 1);
            String tempMaxSub = (sub1.length() > sub2.length()) ? sub1 : sub2;
            maxSubLength = (tempMaxSub.length() > maxSubLength.length()) ? tempMaxSub : maxSubLength;
        }
        return maxSubLength;
    }

    public static String palindromSubstr(String s, int start, int end) {
        while ((start > -1 && end < s.length()) && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }

    public static void main(String[] args) throws Exception {
        LongestPaliSub sub = new LongestPaliSub();
        String s = "babad";
        System.out.println(sub.longestPalindromeII(s));
    }
}
