package Date클래스;
// Date 클래스는 운영체제로부터 시간을 읽어 오는 클래스, 반드시 객체를 생성해서 사용

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now); // Date 기본 포맷 출력
        // 원하는 포맷으로 시간 출력하려면 SimpleDateFormat 사용
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 분을 표현하는 m과 구분하기 위해 M 사용 연-월-일 출력
        f2 = new SimpleDateFormat("yy/MM/dd"); // 연/월/일
        f3 = new SimpleDateFormat("yyyy년MM월d일");
        f4 = new SimpleDateFormat("HH:mm:ss"); // HH 24시간제 hh 시간제
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다."); // W는 월에 몇주차 w는 연에 몇주인지 출력
        f7 = new SimpleDateFormat("오늘은 yyyy년 w주차 입니다.");

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        // Calender 클래스 : Date 클래스의 단점을 보완하기 위해 만들어짐
        // Calender는 추상 클래스로 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스에서 구현
        // 즉 Calender는 추상 클래스 이고 반드시 상속시켜 사용해야함

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1); // 배열의 인덱스를 가져오기 때문에 출력시 +1
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.AM_PM));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));



    }
}
