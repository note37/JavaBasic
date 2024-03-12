package 열거타입;
// 열거타입이란 ? 한정된 값이 열거 상수 중에서 하나의 상수를 저장하는 타입
// 입력값의 타입을 제한할 수 있음
public class EnumMain {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이",Career.JUNIOR,DevType.BACKEND,Gender.MALE);

        developer.devInfo();
    }
}
enum Career {
    JUNIOR, SENIOR
}
enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA

}
enum Gender {
    MALE, FEMALE
}

//개발자 정보에 대한 클래스 생성 가정
class Developer {
    private String name; //이름은 다양해서 제한하기 어려움 만약 한다면 글자제한 정도
    private Career career; // 개발자 등급 (senior, junior)
    private DevType devType; //개발자 업무
    private Gender gender;

    // genarator >> struct 에서 생성자 생성
    public Developer(String name, Career career, DevType devType, Gender gender) {
        this.name = name;
        this.career = career;
        this.devType = devType;
        this.gender = gender;
    }
    public void devInfo(){
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + devType);
        System.out.println("경력 : " + career);
        System.out.println("성별 : "+ gender);
    }
}
