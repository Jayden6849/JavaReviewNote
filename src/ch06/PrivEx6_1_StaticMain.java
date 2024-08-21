package ch06;

public class PrivEx6_1_StaticMain {
    private int i1 = 10;
    private static int i2 = 100;

    public static void main(String[] args) {
        // System.out.println(i1); // 불가능함 - 왜? static 메인에서 해당 클래스의 iv에 접근하려함
        System.out.println(i2);

        /* 그럼 iv i1에 접근하고 싶으면 어떻게 해야하는가? 객체를 생성하자 */
        PrivEx6_1_StaticMain main = new PrivEx6_1_StaticMain();
        System.out.println(main.getI1());
    }

    /* method Override */
    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }
}
