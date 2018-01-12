public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        int num = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (k == array[i]) {
                num++;
            }
        }
        return num;
    }
}