/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/2
 * Time: 0:12
 * Description:
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        boolean flag = false;
        boolean isOk = true;
        try{
            int line = array.length;
            for (int i = 0; i < line && isOk; i++) {
                int column = array[i].length;
                if (target < array[i][0] || target > array[i][column - 1]) {
                    continue;
                }
                for (int j = 0; j < column && isOk; j++) {
                    if (target == array[i][j]) {
                        flag = true;
                        isOk = false;
                    }
                }
            }
        }catch (Exception e){
            isOk = false;
        }
        return flag;
    }
}