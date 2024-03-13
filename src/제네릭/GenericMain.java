package 제네릭;
/*
// 캐스팅 하는 경우
List list = new ArrayList();
list.add("hello");
String str = (String) list.get(0);

// 제네릭 타입
    <강한참조>
List<String> list = new ArrayList()<>;
list.add("hello");
String str = list.get(0);

 */
public class GenericMain {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("가을");
        Person<Integer> p2 = new Person<>(1000);
        System.out.println(p1.info);
        System.out.println(p2.info);
    }
}

class Person <T> { // 자료형 변수명은 관례적으로 대문자
    public T info;
    Person(T info) {
        this.info= info;
    }

}
