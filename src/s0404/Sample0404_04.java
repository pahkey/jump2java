package s0404;

public class Sample0404_04 {
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
        }
    }
}
