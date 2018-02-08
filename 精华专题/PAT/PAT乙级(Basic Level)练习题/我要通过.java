import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strs = new String[N];
		for(int i  = 0;i < N;i++){
			strs[i] = sc.next();
		}
		for(String s:strs){
			judge(s);
		}
	}
	public static void judge(String s) {
		String pattern = "A*PA+TA*";
		String pattern1 = "PA+T";
		if (s.matches(pattern)) {
			if (s.matches(pattern1)) {
				System.out.println("YES");
			} else {
				String temp[] = s.split("P|T");
				int aLength = temp[0].length();
				int bLength = temp[1].length();
				int cLength = temp[2].length();
				if (aLength * bLength == cLength){
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} else {
			System.out.println("NO");
		}
	}  
}
