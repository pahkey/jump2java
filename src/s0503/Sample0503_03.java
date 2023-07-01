package s0503;


public class Sample0503_03 {
    void sum(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }

    public static void main(String[] args) {
        Sample0503_03 sample = new Sample0503_03();
        sample.sum(3, 4);
    }
}

