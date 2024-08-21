package ch06;

public class Ex6_8_ReturnRef {
    public static void main(String[] args) {
        Data d = new Data();

        d.setX(10);

        Data d2 = copy(d);
        System.out.println("d.getX() = " + d.getX());
        System.out.println("d2.getX() = " + d2.getX());

        d.setX(20);
        System.out.println("d.getX() = " + d.getX());
        System.out.println("d2.getX() = " + d2.getX());
    }

    static Data copy(Data d) {
        Data data = new Data();
        data.setX(d.getX());

        return data;
    }
}
