package 클론;
// clone 메소즈 : 얕은 복사가 일어날 상황에서 깊은 복사가 일어 나도록 해주는 메소드
// 얕은 복사: 동일한 주소값을 여러개의 클래스가 참조하는 것
// 깊은 복사: 얕은 복사를 막기 위해 클래스 별로 메모리를 할당 하는 것

public class Clone {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1;
        mem2.age = 100;
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("name : " + mem1.age);
        System.out.println("name : " + mem2.age);

    }
}
