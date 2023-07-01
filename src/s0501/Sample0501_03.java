package s0501;


class Calculator3 {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}


public class Sample0501_03 {
    public static void main(String[] args) {
        Calculator3 cal1 = new Calculator3();  // 계산기1 객체를 생성한다.
        Calculator3 cal2 = new Calculator3();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}

