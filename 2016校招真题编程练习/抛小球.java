public class Balls {
    public int calcDistance(int A, int B, int C, int D) {
        int result = 0;
        result += getHeight(A);
        result += getHeight(B);
        result += getHeight(C);
        result += getHeight(D);
        return result;
    }

    public static double getHeight(double n) {
        if (n == 0)
            return 0;
        return n + n / 2 + getHeight(n / 2);
    }
}