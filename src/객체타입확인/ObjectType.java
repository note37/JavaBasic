package 객체타입확인;
// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Parent parent = new Parent("부모 클래스");
        Child child = new Child("자식 클래스");
        System.out.println(parent instanceof Parent); // [true] instanceof 상속관계가 성립하는지 묻는 코드
        System.out.println(child instanceof Parent);  // [true] Parent로 부터 상속을 받았으므로
        System.out.println(parent instanceof Child); // [false] parent는 Child 클래스에 상속 받지 않았으므로

//        Child child1 = new Parent("sadfds"); // Parent는 차일드 상속이 아니므로 오류


    }
}
class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    Child(String name) {
        super(name); //상위 클래스의 생성자 불러오는 함수?
        this.name = name;
    }

}