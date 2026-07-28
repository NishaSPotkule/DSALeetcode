import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        int n = s.length();
        int mid = n / 2;

        String left;
        String middle = "";

        if (n % 2 == 0) {
            left = s.substring(0, mid);
        } else {
            left = s.substring(0, mid);
            middle = String.valueOf(s.charAt(mid));
        }

        char[] ch = left.toCharArray();
        Arrays.sort(ch);

        String first = new String(ch);

        StringBuilder second = new StringBuilder(first);
        second.reverse();

        return first + middle + second.toString();
    }
}