package solve04;

public class Q05 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark: marks) {  // for each 문
            total += mark;  // A학급의 점수를 모두 더한다.
        }
        float average = (float) total / marks.length;  // 평균을 구하기 위해 총 점수를 총 학생수로 나눈다.
        System.out.println(average);  // 평균 79.0이 출력된다.
    }
}
