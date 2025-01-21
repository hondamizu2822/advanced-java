package sample;

import java.util.HashMap;

public class Ex21 {
    public static void main(String[] args) {
        HashMap<String, String> keyMap = new HashMap<>();

        keyMap.put("東京", "東京");
        keyMap.put("埼玉", "さいたま");
        keyMap.put("茨城", "水戸");
        keyMap.put("沖縄", "那覇");

        for (HashMap.Entry<String, String> entry : keyMap.entrySet()){
            System.out.println(entry.getKey() + "の県庁所在地は「" + entry.getValue() + "」です");
        }

    
    }


}


