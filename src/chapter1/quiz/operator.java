package chapter1.quiz;

public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;

        int sum = a + b;
        System.out.println("더하기 결과는: " + sum);

        int sub = a - b;
        System.out.println("빼기 결과는: " +sub);

        int mul = a * b;
        System.out.println("곱하기 결과는: " + mul);

        int div = a / b;
        System.out.println("나누기 결과는: " + div);

        int mod = a % b;
        System.out.println("나머지 결과는: " + mod);

        boolean qu1 = a > b;
        System.out.println("a가 b보다 큰가? " + qu1);

        boolean qu2 = a < b;
        System.out.println("a가 b보다 작은가? " + qu2);

        boolean qu3 = a == b;
        System.out.println("a와 b가 같은가? " + qu3);

        boolean qu4 = a != b;
        System.out.println("a와 b가 다른가? " + qu4);

        String st1 = "안녕하세요";
        String st2 = "안녕하세용";
        boolean isEquals = st1.equals(st2);
        System.out.println("두문자열이 같은가요?" + isEquals);

    }
}
