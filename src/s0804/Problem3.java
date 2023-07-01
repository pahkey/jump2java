package s0804;

public class Problem3 {
    static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;  // 숫자 n을 10으로 나누고 그 값을 다시 숫자 n에 대입한다.
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3));  // 1 출력
        System.out.println(getDigitCount(25));  // 2 출력
        System.out.println(getDigitCount(333));  // 3 출력
        System.out.println(getDigitCount(7876));  // 4 출력
    }
}

