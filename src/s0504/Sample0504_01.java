package s0504;

class Updater {
    void update(int count) {
        count++;
    }
}

class Counter {
    int count = 0;  // 객체변수
}

public class Sample0504_01 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count);
        System.out.println("after update:"+myCounter.count);
    }
}
