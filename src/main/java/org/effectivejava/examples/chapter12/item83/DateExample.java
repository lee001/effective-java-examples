package org.effectivejava.examples.chapter12.item83;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zw
 * @date 2018/11/27
 */
public class DateExample {
    public static void main(String[] args) {
        /*DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        System.out.println("LocalDateTime转成String类型的现在时间: " + localTime);

        LocalDateTime ldt = LocalDateTime.parse(localTime, df);
        System.out.println("String类型的时间转成LocalDateTime的现在时间: " + ldt);

        System.out.println("--------------------------------");
        //2018-11-04
        System.out.println("今天: " + LocalDate.now());
        //2018-11-04T21:30:20.121
        System.out.println("现在: " + LocalDateTime.now());*/


        Clock c = Clock.systemDefaultZone();
        System.out.println(System.currentTimeMillis());
        System.out.println(c.millis());
    }
}
