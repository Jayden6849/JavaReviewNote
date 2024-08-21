package ch06;

public class Ex6_2_Instance2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값은 " + t1.getChannel() + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.getChannel() + "입니다.");

        t1.setChannel(7);
        System.out.println("t1의 channel 값을 " + t1.getChannel() + "로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.getChannel() + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.getChannel() + "입니다.");
    }
}
