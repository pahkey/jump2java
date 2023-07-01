package solve_exam;

import java.util.ArrayList;

public class Q15 {
    static String caesar(String word, int n) {
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> result = new ArrayList<>();
        for (String c : word.split("")) {
            int pos = A.indexOf(c);
            int newPos = pos + n;
            newPos = newPos % A.length();  // 26 자리가 넘어갈 경우에는 회전할 수 있도록 26으로 나눈 나머지 값을 사용한다.
            result.add(A.substring(newPos, newPos + 1));
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(caesar("CAT", 5));  // HFY
        System.out.println(caesar("XYZ", 3));  // ABC
    }
}
