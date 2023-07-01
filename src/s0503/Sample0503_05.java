package s0503;


public class Sample0503_05 {
    void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample0503_05 sample = new Sample0503_05();
        sample.sayNick("angel");
        sample.sayNick("fool");  // 출력되지 않는다.
    }
}

