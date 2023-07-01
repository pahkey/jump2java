package solve03;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result); // "Life is too short" 출력
    }
}
