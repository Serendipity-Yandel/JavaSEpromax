package d2_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDeom {
    public static void main(String[] args) {
        //  拿到现在时刻日历
        Calendar cal=Calendar.getInstance();
        //获取时间日历的信息
         int year=cal.get(Calendar.YEAR);
        System.out.println(year);

    }
}
