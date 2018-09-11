import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Node[] nodes = new Node[100001];
        Queue<Integer> idQueue = new LinkedList<>();
        Stack<Integer> nextStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String[] array = first.split(" ");
        int start = Integer.parseInt(array[0]);
        int N = Integer.parseInt(array[1]);
        int K = Integer.parseInt(array[2]);
        // 输入链表
        for (int i = 0; i < N; i++) {
            String message = scanner.nextLine();

            array = message.split(" ");
            int id = Integer.parseInt(array[0]);
            int value = Integer.parseInt(array[1]);
            int next = Integer.parseInt(array[2]);
            Node node = new Node(value, next);
            nodes[id] = node;
        }

        Node node = nodes[start];
        int id = start;
        int flag = 0;
        // 统计有效链表长度
        int length = 0;
        // 遍历链表
        while (true) {
            String ID = new DecimalFormat("00000").format(id);
//            System.out.println(ID + " " + node.toString());
            flag++;
            length++;
            if (flag == K) {
                // 向队列中添加一个元素
                idQueue.offer(id);
                flag = 0;
            }
            if (node.getNext() == -1) {
                break;
            }
            id = node.getNext();
            node = nodes[id];
        }

        int tempStart, traverseStart = start;
        int tempId;
        N = length / K;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < K; j++) {
                if (j < K - 1) {
                    nextStack.push(traverseStart);
                }
                traverseStart = nodes[traverseStart].getNext();
            }
            if (i == 1) {
                // 返回队列的第一个元素，不删除
                start = idQueue.peek();
            }
            // 返回队列的第一个元素并删除
            tempId = idQueue.poll();
            // 如果头标栈中没有了
            if (idQueue.isEmpty()) {
                tempStart = nodes[tempId].getNext();
            } else {
                tempStart = idQueue.peek();
            }
            for (int j = 0; j < K - 1; j++) {
                nodes[tempId].setNext(nextStack.peek());
                tempId = nextStack.pop();
            }
            nodes[tempId].setNext(tempStart);
        }


        node = nodes[start];
        id = start;
        // 遍历链表
        while (true) {
            String ID = new DecimalFormat("00000").format(id);
            System.out.println(ID + " " + node.toString());
            if (node.getNext() == -1) {
                break;
            }
            id = node.getNext();
            node = nodes[id];
        }

    }

}

class Node {
    private int value;
    private int next;

    public Node(int value, int next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        if (this.next == -1) {
            return (this.value + " " + this.next);
        }
        String NEXT = new DecimalFormat("00000").format(this.next);
        return (this.value + " " + NEXT);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}