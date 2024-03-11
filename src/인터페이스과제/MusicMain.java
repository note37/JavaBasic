package 인터페이스과제;

// 인터페이스 필요성: 다중상속을 피하기 위해 추상 필드 생성 일종의 기능요구서 기능세부 실행부는 없음
public class MusicMain {
    public static void main(String[] args) {
        Music m = new Music();
        m.play();
        Video v = new Video();
        v.play();

    }
}
