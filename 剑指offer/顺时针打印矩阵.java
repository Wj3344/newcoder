import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (array == null) {
            return arrayList;
        }
        // 行数
        int lineInit = array.length;
        // 列数
        int columnInit = array[0].length;
        while (columnInit > 0 && lineInit > 0) {
            // 打印第一行
            for (int i = 0; i < columnInit; i++) {
                arrayList.add(array[0][i]);
            }
            // 构造新数组
            int[][] temp = new int[lineInit - 1][columnInit];
            for (int i = 1; i < lineInit; i++) {
                for (int j = 0; j < columnInit; j++) {
                    temp[i - 1][j] = array[i][j];
                }
            }
            // 逆时针旋转数组
            array = rotateMatrix(temp, lineInit - 1, columnInit);
            // 行数
            lineInit = array.length;
            // 列数
            columnInit = array[0].length;
        }
        return arrayList;
    }

    /**
     * 將數組旋轉90度
     *
     * @param mat    待旋轉的數組
     * @param column 數組的列,旋转数组的行
     * @param line   數組的行數，旋转数组的列
     * @return 旋轉后的數組
     */
    public static int[][] rotateMatrix(int[][] mat, int line, int column) {
        if (mat == null) {
            return null;
        }
        // 行列翻转，行变列，列变行
        int[][] rmat = new int[column][line];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                rmat[i][j] = mat[j][column - i - 1];
            }
        }
        return rmat;
    }
}