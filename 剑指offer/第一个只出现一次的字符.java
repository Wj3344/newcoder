public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                int[] array = new int[256];
                for (int i = 0; i < length; i++) {
                    char c = str.charAt(i);
                    array[c]++;
                }
                for (int i = 0; i < length; i++) {
                    char c = str.charAt(i);
                    if (array[c] == 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}