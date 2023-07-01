package solve05;

interface Predator9 {
    String bark();
}

abstract class Animal9 {
    public String hello() {
        return "hello";
    }
}

class Dog9 extends Animal9 {
}

class Lion9 extends Animal9 implements Predator9 {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Q09 {
    public static void main(String[] args) {
        Animal9 a = new Lion9();
        Lion9 b = new Lion9();
        Predator9 c = new Lion9();

        System.out.println(a.hello());  // 1번
//        System.out.println(a.bark());   // 2번 오류발생
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
//        System.out.println(c.hello());  // 5번 오류발생
        System.out.println(c.bark());   // 6번
    }
}
