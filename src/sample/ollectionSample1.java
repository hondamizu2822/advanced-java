package sample;

import java.util.ArrayList;
import java.util.List;

public class ollectionSample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        

        
        list.add("スイム");
        list.add("バイク");
        list.add("ラン");

        System.out.println("通常のfor⽂を使⽤してArrayList内の要素を⼀つずつ表⽰");
         for (int i = 0; i < list.size(); i++) {
         String element = list.get(i);
         System.out.println(element);
         
        }
        System.out.println("拡張for⽂を使⽤してArrayList内の要素を⼀つずつ表⽰");
         for (String element : list) {
         System.out.println(element);
         }
    }
    

}
