import java.util.Scanner;

public class Main{
    
    public static int getNum(int num1,int num2){
        int temp = num1 % num2;
        if(temp == 0){
            return num2;
        }
        else{
            return getNum(num2,temp);
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(getNum(a,b));
        }
    }
}