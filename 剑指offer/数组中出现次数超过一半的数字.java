import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array != null) {
            int length = array.length;
            if (length != 0) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < length; i++) {
                    if (map.containsKey(array[i])) {
                        map.put(array[i], map.get(array[i]) + 1);
                    } else {
                        map.put(array[i], 1);
                    }
                }
                for (Map.Entry<Integer, Integer> entry :
                        map.entrySet()) {
                    if (entry.getValue() > length / 2) {
                        return entry.getKey();
                    }
                }
            }
        }
        return 0;
    }
}