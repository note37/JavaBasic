package 디폴트메소드;

// 인터페이스를 다른 곳에서 호출 후 다시 인터페이스에 기능 추가를 할때
// 적용되어있는 다른 파일에도 모두 추가해주어야하는 문제 발생
// 디폴트 메소드만 추가하여 이런 문제 해결
public interface RemoteControl {
    int MAX_VOLUME = 100; // final static 자동 적용되어 오류 미발생 (기능 명세서에서 미리 정한 값의 의미)
    int MIN_VOLUME = 0;
    void turnOn(); // public abstract가 자동 적용
    void turnOff();
    void setVolume(int volume);
    // 디폴트 메소드 추가 : JDK 8 이후 추가된 기능
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    // static을 사용하면 RemoteControl 인터페이스 소속이므로 메소드 다른 곳에서 무조건 구현 해야하는 부분
    static  void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
