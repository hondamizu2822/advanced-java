package sample;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997, 8, 22);

        int year = birthday.getYear();
        int month = birthday.getMonthValue();//←getManthでも問題ないが、整数を取得するためにはValue()が正解である。
        int day = birthday.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");

    
    }


}
