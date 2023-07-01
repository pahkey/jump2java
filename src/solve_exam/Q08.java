package solve_exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Q08 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        // 파일을 읽어 각 라인을 lines에 저장한다.
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            lines.add(line);
        }
        br.close();

        // 총합과 평균값을 구한다.
        int total = 0;
        for (String line : lines) {
            line = line.trim();  // 공백을 제거한다.
            int num = Integer.parseInt(line);  // 문자열을 숫자로 변환한다.
            total += num;
        }
        float average = (float) total / lines.size();  // 평균값은 실수로 계산한다.
        System.out.printf("총합:%d, 평균:%.2f\n", total, average);

        // 평균값을 result.txt에 저장한다.
        PrintWriter pw = new PrintWriter("result.txt");
        pw.write(String.format("%.2f", average));  // 실수를 문자열로 변환하여 저장한다.
        pw.close();
    }
}

