package s0702.house;

public class HousePark {
    protected String lastname = "park";
    public String info = "this is public message.";

    public static void main(String[] args) {
        HouseKim kim = new HouseKim();  // HouseKim 사용을 위해서 import가 필요없다.
        System.out.println(kim.lastname);  // HouseKim 클래스의 lastname 변수를 사용할 수 있다.
    }
}
