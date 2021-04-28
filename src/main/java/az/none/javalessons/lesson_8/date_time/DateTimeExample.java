package az.none.javalessons.lesson_8.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(1998, 10, 19);
        LocalDate date2 = LocalDate.of(1998, Month.OCTOBER, 19);
        LocalDate date3 = LocalDate.parse("1998-10-19");
        LocalDate date4 = LocalDate.MAX;

        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.parse("12:12");
        LocalTime time2 = LocalTime.of(12, 12);
        LocalTime time3 = LocalTime.ofSecondOfDay(12 * 60 * 60);
        LocalTime time4 = LocalTime.NOON;
        LocalTime time5 = LocalTime.MIDNIGHT;

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Not format : " + dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd - HH:mm");
        System.out.println("Format : " + dateTime.format(formatter));

        LocalDateTime first = LocalDateTime.now();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime second = LocalDateTime.now();
        ChronoUnit.SECONDS.between(first, second);
    }
}