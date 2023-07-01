package solve05;

interface Mineral {
    int getValue();
}

class Gold implements Mineral {
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral {
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int getValue() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Q07 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}

