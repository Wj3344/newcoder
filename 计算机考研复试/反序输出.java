import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			StringBuilder sb = new StringBuilder(line);
			System.out.println(sb.reverse().toString());
		}
	}
}
