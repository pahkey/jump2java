package s0501;


class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}


public class Sample0501_02 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
    }
}
