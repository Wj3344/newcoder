/**
 * Created by handsome programmer.
 * User: chen
 * Date: 18-1-15
 * Time: 下午9:43
 * Description:
 */
public class Solution {
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
        m ^= n;
        int num = 0;
        while (m > 0) {
            num += m % 2;
            m = m >> 1;
        }
        return num;
    }
}
