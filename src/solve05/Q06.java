package solve05;

class Calculator6 {
    Integer value;

    Calculator6() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Q06 {
    public static void main(String[] args) {
        Calculator6 cal = new Calculator6();
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
