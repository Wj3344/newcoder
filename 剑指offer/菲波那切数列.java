public class Solution {
    public int Fibonacci(int n) {

        //算法复杂度高
        // if (n < 2) {
        //     return n;
        // } else {
        //     return Fibonacci(n - 1) + Fibonacci(n - 2);
        // }

        int first = 0, second = 1, target = 0;
        if (n < 2)
            return n;
        for (int i = 0; i < n - 1; i++) {
            target = first + second;
            first = second;
            second = target;
        }
        return target;
    }
}