import java.util.HashMap;
import java.util.Map;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int num = array[i];
            int value = 1;
            if (map.get(num) != null) {
                value += map.get(num);
            }
            map.put(num, value);
        }
        int flag = 0;
        for (int i = 0; i < len; i++) {
            int num = array[i];
            int value = map.get(num);
            if (value > 1) {
                continue;
            }
            if (flag == 0) {
                num1[0] = num;
                flag++;
            } else {
                num2[0] = num;
            }
        }
    }
}