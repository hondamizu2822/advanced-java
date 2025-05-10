package sample;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020 , 2, 1);
        LocalDate lastDayOfManth = date.with(TemporalAdjusters.lastDayOfMonth());
        int lastDay = lastDayOfManth.getDayOfMonth();

        System.out.println(lastDay);  

    }

}
