package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("現在の⽇付︓" + localDate);
        System.out.println("⽉末は"+ localDate.with(TemporalAdjusters.lastDayOfMonth()));

        LocalTime localTime = LocalTime.now();
        System.out.println("現在の時間︓" + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の⽇付と時間︓" + localDateTime);
        System.out.println("⽉末は"+ localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

    }

}
