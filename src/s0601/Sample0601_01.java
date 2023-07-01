package s0601;

import java.io.IOException;
import java.io.InputStream;

public class Sample0601_01 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        a = in.read();

        System.out.println(a);
    }
}
