package s0704;


class FoolException2 extends Exception {
}

public class Sample0704_05 {
    public void sayNick(String nick) throws FoolException2 {
        if("fool".equals(nick)) {
            throw new FoolException2();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample0704_05 sample = new Sample0704_05();
        try {
            sample.sayNick("fool");
            sample.sayNick("genious");
        } catch (FoolException2 e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}

