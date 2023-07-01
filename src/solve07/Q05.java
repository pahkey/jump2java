package solve07;

import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers)  // IntStream을 생성한다
                .filter((a) -> a >= 0)  // 음수를 제거한다.
                .toArray()  // int[] 배열로 반환한다.
                ;

        for(int r: result) {
            System.out.println(r);
        }
    }
}
