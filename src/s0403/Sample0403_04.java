package s0403;

public class Sample0403_04 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;  // 짝수인 경우 조건문으로 돌아간다.
            }
            System.out.println(a);  // 홀수만 출력된다.
        }
    }
}
