/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/2
 * Time: 0:12
 * Description:
 */
public class Solution {
    /**
     * 替换空格
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
     * 则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @param str 待替换字符串
     * @return 替换后的字符串
     */
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                stringBuffer.append(c);
            } else {
                stringBuffer.append("%20");
            }
        }
        return stringBuffer.toString();
    }
}