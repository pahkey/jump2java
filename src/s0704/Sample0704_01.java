package s0704;


public class Sample0704_01 {
    public static void main(String[] args) {
        int c;
        try {
            c = 4 / 0;
        } catch(ArithmeticException e) {
            c = -1;  // 예외가 발생하여 이 문장이 수행된다.
        }
    }
}
