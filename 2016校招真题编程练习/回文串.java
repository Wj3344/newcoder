import java.util.Scanner;

public class Main {
    public static boolean isHuiwen(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chas = str.toCharArray();
            boolean flag = false;
            for (int i = 0; i < chas.length; ++i) {
                //复制
                String str1 = String.copyValueOf(chas);
                char[] chas1 = str1.toCharArray();
                chas1[i] = ' '; //每次删除一个
                String s = String.valueOf(chas1).replaceAll(" ", "");
                if (isHuiwen(s)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}