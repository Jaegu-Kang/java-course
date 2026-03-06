package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        // 생성자 호출
        Person person = new Person("강재구");

        // 인스턴스 변수 접근
//        person.name = "강재구";
//        person.secret = "??"; 접근 불가능

        //인스턴스 메서드 접근
//        person.methodA();
//        person.methodB(); 접근 불가능

        //게터
        String name = person.getName();
        System.out.println("이름: " + name);

        //세터
        person.setName("이지아");
        String name2 = person.getName();
        System.out.println("이름: " + name2);

    }
}
