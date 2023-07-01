package solve03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet(numbers);  // List를 Set으로 변경
        ArrayList<Integer> result = new ArrayList<>(temp);  // Set을 다시 List로 변경
        System.out.println(result);  // [1, 2, 3, 4, 5] 출력
    }
}
