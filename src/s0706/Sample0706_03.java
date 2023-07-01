package s0706;

import java.util.function.BiFunction;

public class Sample0706_03 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);  // sum이 아닌 apply 메서드를 사용해야 한다.
        System.out.println(result);  // 7 출력
    }
}
