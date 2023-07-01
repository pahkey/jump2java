package s0706;

import java.util.function.BinaryOperator;

public class Sample0706_04 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result);  // 7 출력
    }
}
