package solve_exam;

public class Q01 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] temp = a.split(":");  // ":" 로 분리
        String result = String.join("#", temp);  // "#" 으로 합침
        System.out.println(result);  // "a#b#c#d" 출력
    }
}
