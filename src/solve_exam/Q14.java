package solve_exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Q14 {
    static String morse(String data) {
        HashMap<String, String> info = new HashMap<>() {{
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
        }};

        ArrayList<String> result = new ArrayList<>();
        for (String word : data.split("  ")) {  // 스페이스 2개로 구분
            for (String c : word.split(" ")) {  // 스페이스 1개로 구분
                result.add(info.get(c));
            }
            result.add(" ");
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(morse(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"));  // HE SLEEPS EARLY
    }
}
