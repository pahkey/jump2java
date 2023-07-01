package s0503;


public class Sample0503_06 {
    int a;  // 객체변수 a

    void varTest(Sample0503_06 sample) {
        sample.a++;
    }

    public static void main(String[] args) {
        Sample0503_06 sample = new Sample0503_06();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}

