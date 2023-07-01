package s0602;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample0602_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        output.close();
    }
}
