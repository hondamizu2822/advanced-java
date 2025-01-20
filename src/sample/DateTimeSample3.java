package sample;

import java.time.LocalDateTime;

public class DateTimeSample3 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018,1,2,3,4,5,999999990);
        System.out.println("⽇付と時間︓" + localDateTime);

        localDateTime = localDateTime.plusYears(1);//←新しいlocalDateTimeが生成されてている
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        System.out.println("進めた後︓" + localDateTime);

        localDateTime = localDateTime.minusYears(1);
        localDateTime = localDateTime.minusMonths(2);
        localDateTime = localDateTime.minusDays(3);
        localDateTime = localDateTime.minusHours(4);
        System.out.println("戻した後︓" + localDateTime);

        localDateTime = localDateTime.minusWeeks(2);
        System.out.println("2週間前︓" + localDateTime);




    }

}
