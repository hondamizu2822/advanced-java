package sample;

import java.util.ArrayList;
import java.util.List;

public class Ex19 {
    private static List<Employee> employees;
    
        
        public static void main(String[] args) {
            //ArrayList<String> names = new ArrayList<>();
            List<Employee> employee = new ArrayList<>();
    
            employees.add(new Employee("伊賀", 30));
            employees.add(new Employee("山田", 28));
            employees.add(new Employee("佐藤", 35));
            employees.add(new Employee("田中", 40));

    
        // names.add("伊賀");
        // names.add("山田");
        // names.add("佐藤");
        // names.add("田中");

        employee.remove(1);
        employee.add(1, new Employee("鈴木", 32) );

        System.out.println("3番目の社員は" + employees.get(2).getName() + "です");

        for (Employee emp: employees) {
            System.out.println(emp.getName());
        }
        
    }

}
