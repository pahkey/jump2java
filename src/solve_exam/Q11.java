package solve_exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {
    static String dashInsert(String data) {
        int[] numbers = Arrays.stream(data.split(""))  // 숫자 문자열을 정수 배열로 변경
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add("" + numbers[i]);
            if (i < numbers.length - 1) {  // 다음 수가 있다면
                boolean isOdd = numbers[i] % 2 == 1;  // 현재 수가 홀수인지 여부
                boolean isNextOdd = numbers[i + 1] % 2 == 1;  // 다음 수가 홀수인지 여부
                if (isOdd && isNextOdd) {  // 두 수가 연속해서 홀수인 경우
                    resultList.add("-");
                } else if (!isOdd && !isNextOdd) {  // 두 수가 연속해서 짝수인 경우
                    resultList.add("*");
                }
            }
        }
        return String.join("", resultList);
    }

    public static void main(String[] args) {
        String data = "4546793";
        String result = dashInsert(data);
        System.out.println(result);  // 454*67-9-3 출력
    }
}
