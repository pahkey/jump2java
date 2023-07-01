package solve06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt", true);
        System.out.print("문장을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        fw.write(String.format("%s\n", line));
        fw.close();
    }
}
