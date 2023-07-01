package solve05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(a);
        a.add(4);
        System.out.println(b.size());  // 3 출력
        System.out.println(a == b);  // false 출력
    }
}
