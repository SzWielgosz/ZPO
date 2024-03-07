package zad03;

public class Car {
    Speed speed;
    Name name;

    public Car(Speed speed, Name name) {
        this.speed = speed;
        this.name = name;
    }

    void doShowCarSpeed(int carSpeed){
        System.out.println(speed.getMaxSpeed(carSpeed));
    }

    void doShowCarName(String carName){
        System.out.println(name.getName(carName));
    }
}

