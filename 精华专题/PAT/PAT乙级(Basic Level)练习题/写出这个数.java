import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            long sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            StringBuilder sb = new StringBuilder();
            String num_str = "" + sum;
            for (int i = 0; i < num_str.length(); i++) {
                sb.append(getStr(num_str.charAt(i) - '0'));
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }

    private static String getStr(int num) {
        String str = "";
        switch (num) {
            case 0:
                str = "ling ";
                break;
            case 1:
                str = "yi ";
                break;
            case 2:
                str = "er ";
                break;
            case 3:
                str = "san ";
                break;
            case 4:
                str = "si ";
                break;
            case 5:
                str = "wu ";
                break;
            case 6:
                str = "liu ";
                break;
            case 7:
                str = "qi ";
                break;
            case 8:
                str = "ba ";
                break;
            case 9:
                str = "jiu ";
                break;
            default:
                break;
        }
        return str;
    }
}