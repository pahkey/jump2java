package s0309;

import java.util.Arrays;
import java.util.HashSet;

public class Sample0309_01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
    }
}
