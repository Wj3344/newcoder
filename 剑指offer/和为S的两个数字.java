import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int length = array.length;
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if(array[i] + array[j] == sum) {
					int t = array[i] * array[j];
					if(t < temp) {
						temp = t;
						list.clear();
						list.add(array[i]);
						list.add(array[j]);
					}
				}
			}
		}
		return list;
	}
}