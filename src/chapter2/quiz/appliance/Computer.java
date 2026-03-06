package chapter2.quiz.appliance;

public class Computer implements Funtion{
    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }

    void interOn(){
        System.out.println("인터넷을 켭니다.");
    }

    void interOff(){
        System.out.println("인터넷을 끕니다.");
    }
}
