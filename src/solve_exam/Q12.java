package solve_exam;

public class Q12 {
    static String compressString(String data) {
        String _c = "";  // data 문자열중 현재 진행중인 문자를 임시저장하기 위한 변수
        int cnt = 0;  // 해당 문자가 몇 번 반복했는지 알 수 있는 카운트 변수
        String result = "";
        for (String c : data.split("")) {  // 입력받은 문자열 data에서 문자 하나씩 c에 대입
            if (!c.equals(_c)) {  // 현재 진행중인 문자와 c가 같지 않은 경우, 즉 새로운 문자의 시작
                _c = c;  // 현재 진행중인 문자와 같지 않으므로 현재진행문자는 c로 대입
                if (cnt > 0) {  // 새로운 문자이므로 결과 문자열에 이전 문자의 카운트(있을 경우에만)에 해당하는 값을 더해 주어야 함
                    result += "" + cnt;
                }
                result += c;  // 새로운 문자이므로 결과문자열에 새로운 문자를 더함
                cnt = 1;  // 새로운 문자이므로 카운트는 1로 초기화
            } else {
                cnt += 1;  // 현재 진행중인 문자와 c가 같기 때문에 카운트가 증가됨
            }
        }
        if (cnt > 0) {  // for 문을 벗어낫을때 이전 문자의 카운트는 최종적으로 한번 더해주어야함
            result += "" + cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        String result = compressString("aaabbcccccca");
        System.out.println(result);  // a3b2c6a1 출력
    }
}
