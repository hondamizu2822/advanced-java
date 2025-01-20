public class Ex05 {
    public static void main(String[] args) {
        String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量⼤数(むりょうたいすう)";

        String[] numbers = bigNumber.split(":");

        for (String number : numbers){
            System.out.println(number);
        }

    }

}
