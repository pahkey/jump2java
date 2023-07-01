package s0504;

class Updater1 {
    void update(Counter1 counter) {
        counter.count++;
    }
}

class Counter1 {
    int count = 0;  // 객체변수
}

public class Sample0504_02 {
    public static void main(String[] args) {
        Counter1 myCounter = new Counter1();
        System.out.println("before update:"+myCounter.count);
        Updater1 myUpdater = new Updater1();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}

