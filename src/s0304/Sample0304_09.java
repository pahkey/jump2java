package s0304;

public class Sample0304_09 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
        for (String r: result) {
            System.out.println(r);
        }
    }
}
