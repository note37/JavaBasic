package 스트링버퍼;

// StringBuffer 와 Stringbuilder는 문자열을 추가하거나 변경 할 때 사용
// 동일한 기능을 하는 String을 사용하면 좀더 간결함.
// String 자료형과의 차이는 문자열이 여러번 반복 추가되어도 한번만 생성 String은 수정 될때마다 추가 생성 여러면 하면 느려짐
public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.delete(0,5);
        sb.insert(5,"HHH");
        System.out.println(sb);

//        String str = "";
//        str += "Hello";
//        str += " ";
//        str += "Java";
//        System.out.println(str);

    }
}
