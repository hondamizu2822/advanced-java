package sample;


import java.time.LocalDateTime;

public class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024,1,20,3,4,5,999999999);
        System.out.println("⽇付と時間︓" + localDateTime);

        int year = localDateTime.getYear();
        System.out.println("年:" + year);
        int month = localDateTime.getMonthValue();
        System.out.println("⽉:" + month);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("⽇:" + dayOfMonth);

    }

}
