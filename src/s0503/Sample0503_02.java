package s0503;


public class Sample0503_02 {
    String say() {
        return "Hi";
    }

    public static void main(String[] args) {
        Sample0503_02 sample = new Sample0503_02();
        String a = sample.say();
        System.out.println(a);  // "Hi" 출력
    }
}

