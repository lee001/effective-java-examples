package org.effectivejava.examples.chapter12.item83;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * @author zw
 * @date 2018/11/27
 */
public class DateExample {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("LocalDateTime转成String类型的现在时间: " + df.format(time));

        LocalDateTime ldt = LocalDateTime.parse(df.format(time), df);
        System.out.println("String类型的时间转成LocalDateTime的现在时间: " + ldt);

        System.out.println("--------------------------------");
        //2018-11-04
        System.out.println("今天: " + LocalDate.now());
        //2018-11-04T21:30:20.121
        System.out.println("现在: " + LocalDateTime.now());


        Clock c = Clock.systemDefaultZone();
        System.out.println(System.currentTimeMillis());
        System.out.println(c.millis());
        Date date = Date.from(c.instant());
        System.out.println(date);

        //获取当前时间
        Instant in = Instant.now();
        System.out.println(in);

        //获取当前日期
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //获取2019年的第45天
        LocalDate localDate = LocalDate.ofYearDay(2019, 45);
        System.out.println(localDate);

        //根据年月日取日期
        localDate = LocalDate.of(2019, Month.AUGUST, 10);
        localDate = LocalDate.of(2019, 8, 10);
        System.out.println(localDate);

        //根据字符串取日期
        localDate = LocalDate.parse("2019-02-15");
        System.out.println(localDate);

        //取本月第一天
        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfThisMonth);

        //取本月第2天
        LocalDate secondDayOfThisMonth = today.withDayOfMonth(2);
        System.out.println(secondDayOfThisMonth);

        //取本月最后一天
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfThisMonth);

        //取下一天
        LocalDate firstDay = lastDayOfThisMonth.plusDays(1);
        System.out.println(firstDay);

        //取2019年1月第一个周一的日期
        LocalDate firstMonday = LocalDate.parse("2019-01-01")
            .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);

        //带纳秒
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //清除纳秒
        System.out.println(now.withNano(0));

        LocalTime localTime = LocalTime.of(22, 33);
        System.out.println(localTime);

        //返回一天中的第60秒 00:01
        localTime = LocalTime.ofSecondOfDay(60);
        System.out.println(localTime);

        //当前时间加2小时10分钟
        LocalTime inTheFuture = LocalTime.now().plusHours(2).plusMinutes(10);
        System.out.println(inTheFuture);


    }
}
