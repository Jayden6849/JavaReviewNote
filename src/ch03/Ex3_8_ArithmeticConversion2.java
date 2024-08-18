package ch03;

public class Ex3_8_ArithmeticConversion2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b); // Overflow 발생함 - 왜? byte의 표현범위를 넘어섬
        System.out.println(c);
    }
}
