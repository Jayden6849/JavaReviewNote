package ch06;

public class Ex6_1_Instance1 {
    public static void main(String[] args) {
        Tv t = new Tv();

        // t.channel = 7; // 캡슐화때문에 이렇게 접근할 수 없음.
        t.setChannel(7);
        t.channelDown();

        System.out.println("현재 채널은 " + t.getChannel() + "입니다.");

    }
}
