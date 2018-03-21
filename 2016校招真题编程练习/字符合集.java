import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            int length = message.length();
            Queue<Character> queue = new LinkedList<Character>();
            int[] array = new int[255];
            for (int i = 0; i < length; i++) {
                char temp = message.charAt(i);
                if (array[temp] == 0) {
                    queue.offer(temp);
                    array[temp]++;
                }
            }
            while (!queue.isEmpty()) {
                System.out.print(queue.poll());
            }
            System.out.println();
        }
    }
}