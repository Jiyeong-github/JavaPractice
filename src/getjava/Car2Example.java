package getjava;

public class Car2Example {
    public static void main(String[] args) {
        Car2 car = new Car2("마세라티");
        Car2 car2 = new Car2("짚");
        car.keyTurnOn();
        car.run();
        car2.run();
        int speed = car.getSpeed();
        System.out.println("현재 속도:" + speed + "km/h");
    }
}
