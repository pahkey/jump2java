package s0702.house.person;

import s0702.house.HousePark;

public class EungYongPark extends HousePark {  // HousePark을 상속했다.
    public static void main(String[] args) {
        EungYongPark eyp = new EungYongPark();
        System.out.println(eyp.lastname);  // 상속한 클래스의 protected 변수는 접근이 가능하다.
    }
}
