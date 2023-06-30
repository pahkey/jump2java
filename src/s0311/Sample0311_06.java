package s0311;

public class Sample0311_06 {
    public static void main(String[] args) {
        String num = "123.456";
        int n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.
    }
}
