import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/2/26
 * Time: 16:09
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            Student student = new Student();
            student.name = scanner.next();
            student.id = scanner.next();
            student.grade = scanner.nextInt();
            map.put(student.grade, student);
            list.add(student.grade);
        }
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int num = 0;
        Collections.sort(list);
        for (int i = N - 1; i >= 0; --i) {
            int grade = list.get(i);
            if (grade >= start && grade <= end) {
                Student student = map.get(grade);
                System.out.println(student.name + " " + student.id);
                num++;
            }
        }
        if (num == 0) {
            System.out.println("NONE");
        }
    }
}

class Student {
    int grade;
    String name;
    String id;

    public Student() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}