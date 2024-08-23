package ch06;

public class Ex6_13_ConstructorThis {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Blue");
        Car c3 = new Car("Silver", "Auto", 6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
