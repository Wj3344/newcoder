import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] array = line.split(" ");
			for(String s:array) {
				if(!list.contains(s)) {
					list.add(s);
				}
			}
		}
		System.out.println(list.size());
	}
}
