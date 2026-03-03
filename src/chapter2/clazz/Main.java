package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        // 객체 생성(인스턴스화)
        Person personA = new Person("강재구", 39);
        Person personB = new Person("이지아", 41);

        // 속성에 직접 접근
//        System.out.println("설정 전 PersonA 이름: " + PersonA.name);
//        System.out.println("설정 전 PersonB 이름: " + PersonB.name);
//        PersonA.name = "강재구";
//        PersonB.name = "이지아";
//        System.out.println("설정 후 PersonA 이름" + PersonA.name);
//        System.out.println("설정 후 PersonB 이름" + PersonB.name);

        // 기능 활용
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(4, 4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //게터 활용
        String name = personB.getName();
        System.out.println("name = " + name);

        //세터 활용
        System.out.println("personA 의 주소 " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소 " + personA.address);
}
}