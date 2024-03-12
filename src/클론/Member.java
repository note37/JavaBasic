package 클론;

public class Member implements  Cloneable{ //Clonealble 은 인터페이스인데 메소드 , Overdrive 없이도 오류가 없음 즉 Cloneable은 메소드 구현 의무가 없음
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메서드는 Object타입이므로 Member 타입으로 변경
        } catch (CloneNotSupportedException e) { }
        return cloned;
    }
}
