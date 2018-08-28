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
            int N = Integer.parseInt(scanner.nextLine());
            int flag = Integer.parseInt(scanner.nextLine());
            List<Student> students = new ArrayList<Student>(N);
            for (int i = 0; i < N; i++) {
                String msg = scanner.nextLine();
                students.add(new Student(msg));
            }

            students.sort(new Comparator<Student>() {
                /**
                 * 返回的参数是int类型，0则表示相等，1表示大于，-1负数则表示小于。
                 *
                 * @param o1
                 * @param o2
                 * @return
                 */
                public int compare(Student o1, Student o2) {
                    int num = 0;
                    if (o1.getScore() == o2.getScore()) {
                        num = 0;
                    } else if (o1.getScore() > o2.getScore()) {
                        num = 1;
                    } else {
                        num = -1;
                    }
                    if (flag == 0) {
                        num = -num;
                    }
                    return num;
                }
            });
            for (Student s : students) {
                System.out.println(s.name + " " + s.score);
            }
        }
    }
}

class Student {
    int score;
    String name;

    public Student(String msg) {
        String[] array = msg.split(" ");
        if (array.length == 2) {
            this.score = Integer.parseInt(array[1]);
            this.name = array[0];
        }
    }

    public int getScore() {
        return score;
    }
}