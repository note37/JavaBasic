package 오브젝트클래스;

// 오브젝트 클래스는 모든 클래스의 조상 클래스
public class ObjectClass {
    public static void main(String[] args) {
        Student studnet = new Student();
        Car car01 = new Car();
        Car car02 = new Car();
        boolean s = car01 == car02;
        System.out.println(car01.equals(car02));
        car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(s);
        System.out.println(car01.equals(car02));
        System.out.println(car01.toString()); // toSting 은 클래스이름@16진수해시코드가 추가됨.
        System.out.println(car02.toString());
    }
}

class Student {
    int id;
    String name;
}
class Car {

}