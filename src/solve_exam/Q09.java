package solve_exam;

import java.util.Arrays;

class Calculator {
    int[] data;
    public Calculator(int[] data) {
        this.data = data;
    }

    public int sum() {
        return Arrays.stream(data).sum();
    }

    public float avg() {
        return (float) sum() / data.length;
    }
}

public class Q09 {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}
