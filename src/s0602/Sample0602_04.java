package s0602;

import java.io.IOException;
import java.io.PrintWriter;

public class Sample0602_04 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
