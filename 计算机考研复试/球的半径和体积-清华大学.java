import java.util.Scanner;

public class Main{
    private static double PI = Math.acos(-1);
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int z0 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int z1 = sc.nextInt();
            int x = (x0 - x1) * (x0 - x1);
            int y = (y0 - y1) * (y0 - y1);
            int z = (z0 - z1) * (z0 - z1);
            double R = Math.sqrt(x + y + z);
            double S = 4 * PI * R * R * R / 3;
            System.out.printf("%.3f %.3f\n", R, S);
        }
    }
}