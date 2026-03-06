package chapter2.quiz.appliance;

public class Tv implements Funtion{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    void chUp(){
        System.out.println("채널을 올립니다.");
    }

    void chDown(){
        System.out.println("채널을 내립니다.");
    }
}
