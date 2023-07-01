package s0802;

public class Problem1 {
    public static void main(String[] args) {
        int result = 0;
        for (int n = 1; n < 1000; n++) {
            if (n % 3 == 0 || n % 5 == 0) {
                result += n;
            }
        }
        System.out.println(result);
    }
}
