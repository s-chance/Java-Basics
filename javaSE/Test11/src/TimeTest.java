import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        //解析
        //DateTimeFormatter设置格式并格式化
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //格式化得到日期字符串
        String format = pattern.format(LocalDateTime.now());
        System.out.println(format);
        //TemporalAccessor解析字符串为LocalDateTime对象
        //在使用LocalTime时，需要注意12小时制和24小时制的区别
        //12小时制：hh:mm:ss a 24小时制：HH:mm:ss
        //12小时制和24小时制可能会导致 LocalDateTime 和 LocalTime 解析失败
        TemporalAccessor parse = pattern.parse(format);
        LocalDateTime localDateTime = LocalDateTime.from(parse);
        System.out.println(localDateTime);
        System.out.println();
        //计算时间间隔
        //Period.between计算LocalDate
        LocalDate localDate1 = LocalDate.of(2022-1900, 6-1, 17);
        LocalDate localDate2 = LocalDate.of(2022, 6, 17);

        System.out.println(localDate1);
        System.out.println(localDate2);
        //相差几个月(不考虑年份的差距)
        System.out.println(Period.between(localDate1, localDate2).getMonths());
        System.out.println(Period.between(localDate1, localDate2).toTotalMonths()/1900/12);
        System.out.println();
        //Duration.between计算LocalTime
        LocalTime localTime1 = LocalTime.of(19, 49, 30);
        LocalTime localTime2 = LocalTime.of(20, 30, 46);
        //相差几分钟
        System.out.println(Duration.between(localTime1, localTime2).toMinutes());
    }
}
