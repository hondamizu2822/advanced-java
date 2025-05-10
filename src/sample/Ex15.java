package sample;

public class Ex15 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run(40);
        
        try{
            car.run(200);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }

}
