package s0503;


public class Sample0503_01 {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample0503_01 sample = new Sample0503_01();
        int c = sample.sum(a, b);

        System.out.println(c);
    }
}

