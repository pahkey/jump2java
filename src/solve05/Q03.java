package solve05;

class Calculator3 {
    boolean isOdd(int num) {
        return num % 2 == 1;
    }
}

public class Q03 {
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력
    }
}
