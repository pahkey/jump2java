package solve_exam;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9):");
        int num = sc.nextInt();  // 사용자로부터 숫자를 입력받는다.
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d ", i * num);  // 뒤에 공백을 포함하여 구구단의 숫자를 출력한다.
        }
    }
}
