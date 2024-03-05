package 스캐너사용하기;
import java.util.Scanner;

// Scanner 클래스 : 자바에서 입력을 받기 위해서 만들어진 클래스(콘솔 입력, 파일 입력 등이 가능)
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 클래스로 sc참조변수에 객체를 생성해 대입 함.
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); // 이름(문자열)을 입력 받아 name 변수에 대입
        sc.nextLine(); //버퍼 비우기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); //주소는 공백이 포함 되기 때문 nextLine()사용
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 스캐너에서 문자를 입력 받기 위해서는 문자열에서 인덱스로 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }
}
