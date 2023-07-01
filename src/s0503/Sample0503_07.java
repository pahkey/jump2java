package s0503;


public class Sample0503_07 {
    int a;  // 객체변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args) {
        Sample0503_07 sample = new Sample0503_07();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}

