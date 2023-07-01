package solve04;

public class Q03 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i += 1;  // while문 수행 시 1씩 증가
            if (i > 5) {  // i 값이 5보다 크면 while문을 벗어난다.
                break;
            }
            for (int j = 0; j < i; j++) {  // i 값 개수만큼 *를 출력한다.
                System.out.print('*');  // 줄바꿈 문자를 제거하기 위해 println 대신 print를 사용한다.
            }
            System.out.println("");  // * 출력후 줄바꿈 문자를 출력한다.
        }
    }
}
