package s0307;

public class Sample0307_07 {
    public static void main(String[] args) {
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
