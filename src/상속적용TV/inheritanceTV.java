package 상속적용TV;
// 시제품 TV를 만들고, 상속 받아서 기능이 개선된 양산용 TV 만들기

public class inheritanceTV {
    public static void main(String[] args) {
        // ProductTV productTV = new ProductTV();
        ProductTV lgTV = new ProductTV("My Home TV");
        lgTV.setPower(true);
        lgTV.setVolume(90);
        lgTV.setChannel(1500, false);
        lgTV.view();

    }
}
