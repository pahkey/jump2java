package solve_exam;

import java.util.HashMap;

public class Q02 {
    public static void main(String[] args)  {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println(a.getOrDefault("C", 70));  // 70 출력
    }
}
