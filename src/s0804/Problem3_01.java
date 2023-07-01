package s0804;

public class Problem3_01 {
    static int getDigitCount(int n) {
        String s = "" +n;  // 숫자를 문자열로 바꾼다.
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3));  // 1 출력
        System.out.println(getDigitCount(25));  // 2 출력
        System.out.println(getDigitCount(333));  // 3 출력
        System.out.println(getDigitCount(7876));  // 4 출력
    }
}

