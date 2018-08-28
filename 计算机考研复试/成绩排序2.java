
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/8/14
 * Time: 12:29
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            Student[] students = new Student[N];
            for (int i = 0; i < N; i++) {
                int id = scanner.nextInt();
                int score = scanner.nextInt();
                students[i] = new Student(id, score);
            }
            Arrays.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    // 按照学生的成绩从小到大进行排序，并将排序后的学生信息打印出来。
                    // 如果学生的成绩相同，则按照学号的大小进行从小到大排序。
                    if (o1.score < o2.score) {
                        return -1;
                    } else if (o1.score == o2.score) {
                        if (o1.id < o2.id) {
                            return -1;
                        } else {
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                }
            });
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].id + " " + students[i].score);
            }
        }
    }
}

class Student {
    //    两个整数p和q，分别代表每个学生的学号和成绩。
    int id, score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }
}