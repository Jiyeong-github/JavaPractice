package getjava;

public class Car2 {
    //필드
    String model;
    int speed;

    //생성자
    Car2(String model) {
        this.model = model;
    }

    //메소드
    void setSpeed(int speed){
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌림");
    }

    void run() {
        for (int i = 10; i <= 50; i += 10) {
            speed = i;
            System.out.println("달립니다.(시속:" + speed + "km/h");
        }
    }
}
