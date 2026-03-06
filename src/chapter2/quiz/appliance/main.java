package chapter2.quiz.appliance;

public class main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        AirConditioner airConditioner = new AirConditioner();
        Tv tv = new Tv();

        computer.turnOn();
        airConditioner.turnOn();
        tv.turnOn();

        computer.turnOff();
        airConditioner.turnOff();
        tv.turnOff();

        computer.interOn();
        computer.interOff();

        airConditioner.tempUp();
        airConditioner.tempDown();

        tv.chUp();
        tv.chDown();
    }
}
