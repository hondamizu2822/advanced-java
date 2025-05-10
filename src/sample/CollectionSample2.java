package sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample2 {
    public static void main(String[] args) {
        List<Triathlon> list = new ArrayList<>();
        list.add(new Triathlon("スプリント", 0.75, 20.0, 5.0));
        list.add(new Triathlon("スタンダード", 1.5, 40.0, 10.0));
        list.add(new Triathlon("アイアンマン70.3", 1.9, 90.0, 21.0975));
        list.add(new Triathlon("アイアンマン", 3.8, 180.0, 42.195));

        System.out.println("通常のfor⽂を使⽤してArrayList内の要素を⼀つずつ表⽰");
        for (int i = 0; i < list.size(); i++) {
        Triathlon triathlon = list.get(i);
        System.out.println(triathlon);
        
        }

        System.out.println("拡張for⽂を使⽤してArrayList内の要素を⼀つずつ表⽰");
        for (Triathlon triathlon : list) {
        System.out.println(triathlon); 
        }

    }
}
