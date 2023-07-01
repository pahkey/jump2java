package s0601;

import java.io.IOException;
import java.io.InputStream;

public class Sample0601_03 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
