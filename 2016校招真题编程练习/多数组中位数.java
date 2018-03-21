public class Solution {
    public int getUpMedian(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int N = arr1.length;
        int index = 1;
        while (true) {
            if (arr1[i] < arr2[j]) {

                if (index == N) {
                    return arr1[i];
                }
                index++;
                i++;
            } else {

                if (index == N) {
                    return arr2[j];
                }
                index++;
                j++;
            }
        }
    }
}