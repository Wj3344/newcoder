import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int sum = 0;
            for(int i = 0;i < 5;i++){
                int t = sc.nextInt();
                if(t < a){
                    sum += t;
                }
            }
            System.out.println(sum);
        }
    }
}