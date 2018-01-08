import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char target = sc.nextLine().toUpperCase().toCharArray()[0];
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                num++;
            }
        }
        System.out.println(num);
    }
}