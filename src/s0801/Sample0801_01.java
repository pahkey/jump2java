package s0801;

public class Sample0801_01 {

    static int[] gugu(int dan) {
        int[] result = new int[9];
        for(int i=0; i<result.length; i++) {
            result[i] = dan * (i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = gugu(2);
        for (int a: result) {
            System.out.println(a);
        }
    }
}
