import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.get(key) != null) {
                value += map.get(key);
            }
            map.put(key, value);
        }
        Set<Integer> set = map.keySet();
        Set<Integer> setTemp = new TreeSet<Integer>();
        setTemp.addAll(set);
        for (Integer key : setTemp) {
            System.out.println(key + " " + map.get(key));
        }
    }

}