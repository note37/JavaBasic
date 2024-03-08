package 추상클래스;

public abstract class Phone { // 추상클래스로 객체 생성 불가
    public  String name;
    public boolean isPower;

    public Phone(String name) {
        this.name = name;
    }

    public void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power On");
        } else {
            System.out.println("Phone Power Off");
        }
    }
    abstract void call(); // {} 다른 클래스처럼 구현부 생성 코드를 넣으면 오류 발생
}
