package s0805;

public class Problem4 {
    static int getCharCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {  // 공백이 아닌 경우에만 결괏값을 증가
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getCharCount("점프 투 자바"));  // 5 출력
        System.out.println(getCharCount("점프 투 자바의 연습문제 풀이"));  // 12 출력
    }
}


