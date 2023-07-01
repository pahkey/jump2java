package s0405;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample0406_01 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
