package s0706;

@FunctionalInterface
interface Calculator1 {
    int sum(int a, int b);
}

public class Sample0706_02 {
    public static void main(String[] args) {
        Calculator1 mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}

