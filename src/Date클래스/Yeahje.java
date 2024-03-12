package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Calendar 클래스로 yyyy년MM월dd HH시mm분ss초 포맷과 동일하게 출력 하기
public class Yeahje {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat f1;
        f1 = new SimpleDateFormat("YYYY년MM월dd일 HH시mm분ss초");
        System.out.println(f1.format(now));

        Calendar current = Calendar.getInstance();
        System.out.println(current.get(Calendar.YEAR)+"년"+(current.get(Calendar.MONTH)+1)+"월"+current.get(Calendar.DATE)+"일"+current.get(Calendar.HOUR)+"시"+current.get(Calendar.MINUTE)+"분"+current.get(Calendar.SECOND)+"초");

    }
}
