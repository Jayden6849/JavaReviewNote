package ch06;

public class Ex6_6_PrimitiveParam {
    public static void main(String[] args) {
        Data d = new Data();

        d.setX(10);
        System.out.println("main() : x = " + d.getX());

        /* Getter와 Setter로만 접근할 수 있게 하는 것이 바람직하지만 예제를 위해 임의로 설정 */
        change(d.x);
        System.out.println("==After change==\nmain() : x = " + d.getX());
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
