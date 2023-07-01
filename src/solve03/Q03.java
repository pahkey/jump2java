package solve03;

public class Q03 {
    public static void main(String[] args) {
        String pin = "881120-1068234";
        String yyyyMMdd = pin.substring(0, 6);
        String num = pin.substring(7);
        System.out.println(yyyyMMdd);  // 881120 출력
        System.out.println(num);  // 1068234 출력
    }
}
