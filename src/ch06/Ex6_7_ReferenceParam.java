package ch06;

public class Ex6_7_ReferenceParam {
    public static void main(String[] args) {
        Data d = new Data();

        d.setX(10);
        System.out.println("main() : x = " + d.getX());

        /* 이 경우는 Getter와 Setter로만 접근할 수 있게 해도 성립함. 다만 예제의 비교를 위해 임의로 설정 */
        change(d);
        System.out.println("==After change==\nmain() : x = " + d.getX());
    }

    static void change(Data d) {
        d.setX(1000);
        System.out.println("change() : x = " + d.getX());
    }
}
