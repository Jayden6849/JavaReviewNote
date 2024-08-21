package ch06;

public class Ex6_4_Method {
    public static void main(String[] args) {
        long result1 = MyMath.add(5L, 3L);
        long result2 = MyMath.subtract(5L, 3L);
        long result3 = MyMath.multiply(5L, 3L);
        double result4 = MyMath.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
