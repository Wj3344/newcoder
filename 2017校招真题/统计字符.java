import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int[] array = new int[1024];
            String message = scan.nextLine();
            for (int i = 0; i < message.length(); i++) {
                char temp = message.charAt(i);
                array[temp]++;
                if( (array[temp] >= 3 && temp >= 'a' && temp <= 'z')||
                        (array[temp] >= 3 && temp >= 'A' && temp <= 'Z')){
                    System.out.println(temp);
                    break;
                }
            }
        }
        scan.close();
    }

}