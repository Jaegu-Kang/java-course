package chapter2.quiz;

public class Car {
    String name;
    String model;
    int price;

    Car(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    void introduce() {
        System.out.println("내 차의 이름은: " + name);
        System.out.println("내 차의 모델은: " + model);
        System.out.println("내 차의 가격은: " + price + "만원");
    }


}
