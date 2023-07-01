package solve03;

public class Q05 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);  // a#b#c#d 출력
    }
}
