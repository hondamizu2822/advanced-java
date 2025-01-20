package sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex10 {
    public static void main(String[] args) {
            LocalDate date = LocalDate.of(2020, 7 ,27);
             
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String formattedDate1 = date.format(formatter);
            System.out.println(formattedDate1);
 
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年M月d日");
            String formattedDate2 = date.format(formatter2);
            System.out.println(formattedDate2);
 
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMM月dd日");
            String formattedDate3 = date.format(formatter3);
            DayOfWeek dayOfWeek = date.getDayOfWeek(); // 曜日を取得
            String weekday = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.JAPAN);
            System.out.println(formattedDate3 + "(" + weekday.substring(0, 1) + ")");
 
 
    }
    

}
