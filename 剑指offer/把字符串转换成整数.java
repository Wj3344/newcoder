public class Solution {
    public int StrToInt(String str) {
        String regex = "^[+-]?[0-9]*$";
        if (!str.matches(regex) || str.equals("")) {
            return 0;
        }
        int num = 0;
        int start = 0;
        int length = str.length();
        if (str.charAt(0) == '+') {
            num = 1;
            start = 1;
        }
        if (str.charAt(0) == '-') {
            num = -1;
            start = 1;
        }
        int result = 0;
        for (; start < length; start++) {
            result = result * 10 + (str.charAt(start) - '0');
        }
        if (num != 0) {
            result = result * num;
        }
        return result;
    }
}