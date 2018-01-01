import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            list.add(temp);
        }
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}