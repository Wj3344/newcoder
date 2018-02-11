import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int N = Integer.parseInt(message);
        String maxName = null, maxId = null;
        int maxScore = 0;
        String minName = null, minId = null;
        int minScore = 100;
        String tempName = null, tempId = null;
        int temp;
        for (int i = 0; i < N; i++) {
            message = scanner.nextLine();
            String[] messages = message.split(" ");
            tempName = messages[0];
            tempId = messages[1];
            temp = Integer.parseInt(messages[2]);
            if (temp > maxScore) {
                maxScore = temp;
                maxName = tempName;
                maxId = tempId;
            }
            if (temp < minScore) {
                minScore = temp;
                minName = tempName;
                minId = tempId;
            }
        }
        //}第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
        System.out.println(maxName + " " + maxId);
        System.out.println(minName + " " + minId);

        scanner.close();
    }
}