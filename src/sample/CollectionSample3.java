package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionSample3 {

    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        map.put("ID0001", new Employee("有賀", 10));
        map.put("ID0002", new Employee("伊賀", 30));
        map.put("ID0003", new Employee("宇賀", 18));

        Employee employee = map.get("ID0004");
         //if (employee != null) {
          System.out.println(employee); // ←toString()メソッドが呼ばれる

          Set<String> idSet = map.keySet();
         
                  for (String key : idSet){
            System.out.println(key + ":" + map.get(key));
        }
          
          

    }

        
}


