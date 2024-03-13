package ArrayList;

// List 인터페이스는 ArrayList, Vector, LinkedList 의 부모 인터페이스
// List의 특징은 배열과 유사하지만, 동적으로 크기가 변함.
// 요소의 저장 순서 유지
// 중복 저장 허용
// 여러가지 메소드 제공
// ArrayList는 검색에는 유용하나 삽입삭제는 메모리에 할당된 데이터를 이동시켜야하기 때문에 오래걸림

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // asList() : 배열을 List로 변환하기 위해 사용
        String[] data = {"138","129","142"};
        List<String> pitches = new ArrayList<>();
        pitches.add("138"); //리스트에 값 추가
        pitches.add("129");
        pitches.add("142");
        pitches.add(0,"000");
        System.out.println(pitches);
        String one = pitches.get(0); // 해당 인덱스의 값을 가져옴.
        String two = pitches.get(1);
        System.out.println(one + ", "+two);
    }
}
