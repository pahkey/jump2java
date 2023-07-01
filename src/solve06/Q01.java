package solve06;

import java.util.Scanner;


public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요:");
        int first = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요:");
        int second = sc.nextInt();

        int result = first + second;
        System.out.printf("%d + %d = %d 입니다.%n", first, second, result);
    }
}

