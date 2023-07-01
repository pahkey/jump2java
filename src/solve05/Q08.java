package solve05;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Q08 {
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번
        Animal b = new Dog();  // 2번
        Animal c = new Lion();  // 3번
//        Dog d = new Animal();  // 4번 오류발생
        Predator e = new Lion();  // 5번
    }
}
