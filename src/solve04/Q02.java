package solve04;

public class Q02 {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {  // 3으로 나누어 떨어지는 수는 3의 배수
                result += i;
            }
            i += 1;
        }
        System.out.println(result);  // 166833 출력
    }
}
