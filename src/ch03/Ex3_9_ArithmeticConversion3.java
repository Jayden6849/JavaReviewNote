package ch03;

public class Ex3_9_ArithmeticConversion3 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // 오버플로우 발생할듯 - 왜? int * int 의 연산결과는 이미 int - long 그릇에 담는게 무슨 의미임
        System.out.println(c);

        long d = a * (long)b;
        System.out.println(d);
    }
}
