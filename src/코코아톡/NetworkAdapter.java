package 코코아톡;


/*
ORM(Object relationship model)
JPA
 */
public interface NetworkAdapter {
    void connect(); // public abstract가 자동 적용 됨
    void send(String msg);

}
class WiFi implements NetworkAdapter {

    @Override
    public void connect() {
        System.out.println("와이파이에 연결 되었습니다.");

    }

    @Override
    public void send(String msg) {
        System.out.println("WIFI >>" + msg);

    }
}
class FiveG implements NetworkAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결 되었습니다.");

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);

    }
}
class LTE implements NetworkAdapter {

    @Override
    public void connect() {
        System.out.println("LTE에 연결 되었습니다.");

    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >>" + msg);

    }
}


