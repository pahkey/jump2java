package s0704;


class FoolException extends RuntimeException {
}

public class Sample0704_03 {
    public void sayNick(String nick) {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample0704_03 sample = new Sample0704_03();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}
