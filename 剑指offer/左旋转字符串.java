public class Solution {
    public String LeftRotateString(String str, int n) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        n = n % len;
        StringBuffer sb = new StringBuffer(str);
        String temp = sb.substring(0, n);
        sb.delete(0, n);
        sb.append(temp);
        return sb.toString();
    }
}
