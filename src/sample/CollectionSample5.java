package sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample5 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        for(int intElement : list) { //
            System.out.println(intElement);
        }
        
    }

}
