package ch03;

public class Ex3_10_ArithmeticConversion4 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; // Overflow
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
