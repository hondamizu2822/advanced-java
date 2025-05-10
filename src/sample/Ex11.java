package sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11 {

    public static void main(String[] args) {
        LocalDate olympicOpeningDay = LocalDate.of(2020, 7, 24);
        LocalDate myBirthday = LocalDate.of(1997, 8, 22);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        String olympicDate = olympicOpeningDay.format(formatter);
        DayOfWeek olympicDayOfWeek = olympicOpeningDay.getDayOfWeek();
        System.out.println("オリンピックが開催される");
        System.out.println(olympicDate + "は" + olympicDayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.JAPAN) + "です");

        String birthdayDate = myBirthday.format(formatter);
        DayOfWeek birthdayDayOfWeek = myBirthday.getDayOfWeek();
        System.out.println("自分の誕生日である");
        System.out.println(birthdayDate + "は" + birthdayDayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.JAPAN) + "です");
    }

}




