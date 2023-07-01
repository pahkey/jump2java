package solve_exam;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력해 주세요:");
        String userInput = sc.nextLine();  // 사용자로부터 한 줄 입력을 받는다.
        String[] numbers = userInput.split(",");  // "," 구분자로 나눈다.
        int total = 0;
        for(String num: numbers) {
            num = num.trim();  // 숫자 문자의 공백을 제거한다.
            int n = Integer.parseInt(num);  // 숫자 문자를 정수로 변환한다.
            total += n;
        }
        System.out.printf("총합은 %d 입니다.\n", total);
    }
}
