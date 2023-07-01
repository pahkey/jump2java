package s0704;


class FoolException1 extends Exception {
}

public class Sample0704_04 {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException1();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException1 e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Sample0704_04 sample = new Sample0704_04();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}

