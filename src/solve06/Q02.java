package solve06;

import java.util.Scanner;


public class Q02 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("영어 문장을 입력하세요:");
            String line = sc.nextLine();
            if ("END".equals(line)) {  // 입력문장이 "END" 이면 종료
                break;
            }
            System.out.println(line.toUpperCase());  // 대문자로 변경하여 출력
        }
    }
}

