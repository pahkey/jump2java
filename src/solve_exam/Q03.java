package solve_exam;

public class Q03 {
    public static void main(String[] args)  {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = 0;
        for (int a : A) {
            if (a >= 50) {
                total += a;
            }
        }
        System.out.println(total);  // 481  출력

//        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
//        int total = Arrays.stream(A).filter((a) -> a >= 50).sum();
//        System.out.println(total);  // 481  출력
    }
}
