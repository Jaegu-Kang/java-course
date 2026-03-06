package chapter2.quiz.appliance;

public class AirConditioner implements Funtion{
    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }

    void tempUp(){
        System.out.println("온도를 올립니다.");
    }

    void tempDown(){
        System.out.println("온도를 내립니다.");
    }
}
