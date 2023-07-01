package solve03;

import java.util.HashMap;

public class Q08 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");
        System.out.println(result);  // 80 출력
        System.out.println(grade);  // {A=90, C=70} 출력
    }
}
