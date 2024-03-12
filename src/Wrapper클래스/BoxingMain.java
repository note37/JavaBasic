package Wrapper클래스;

// Wrapper class : 기본타입을 객체 타입으로 취급해야하는 경우 사용(제네릭, 컬렉션프레임 워크)

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = new Integer(17);
        int n = num.intValue();

        Integer num2 = 0; // 오토박싱
        int s = num2; // 오토 언박싱

    }
}
