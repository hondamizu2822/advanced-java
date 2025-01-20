package sample;
public class Human {

    private String name;
    private int age;
    private String birthplace;

    
    public Human() {}

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }



  
    @Override
     public String toString() {
        return "Human [name=" + name + ", age=" + age + ", birthplace=" + birthplace + "]";
        
    }
        
    

}

