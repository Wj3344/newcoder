/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/1
 * Time: 22:26
 * Description:
 */
public class Solution {
    public int NumberOf1(int n) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            // 0x80000000 是一个首位为1，其余位数为0的整数
            int t = (n & 0x80000000 >>> i) >>> (31 - i);
            if (t == 1) {
                num++;
            }
        }
        return num;
    }
}
