package sample;

public class Car {
    private int speed;

    public void run(int speed){
        if (speed < 0 || speed > 180){
            throw new IllegalArgumentException("スピードの出し過ぎです");

        }
        this.speed = speed;
        System.out.println("スピードが" + this.speed + "km/hになりました");
        
    }
}

