package solve05;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator4 {
    int avg(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }
}

public class Q04 {
    public static void main(String[] args) {
        Calculator4 cal = new Calculator4();

        int[] data1 = {1, 3, 5, 7, 9};
        int result1 = cal.avg(data1);
        System.out.println(result1);  // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal.avg(data2);
        System.out.println(result2);  // 5 출력
    }
}

