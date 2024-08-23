package ch06;

public class Quiz6_19 {
    public static void main(String[] args) {
        Tv t = new Tv();

        t.setChannel(100);
        t.setVolume(0);
        System.out.println("CH: " + t.getChannel() + ", VOL: " + t.getVolume());

        t.channelDown();
        t.volumeDown();
        System.out.println("CH: " + t.getChannel() + ", VOL: " + t.getVolume());

        t.setVolume(100);
        t.channelUp();
        t.volumeUp();
        System.out.println("CH: " + t.getChannel() + ", VOL: " + t.getVolume());

        t.channelUp();
        System.out.println("CH: " + t.getChannel() + ", VOL: " + t.getVolume());
    }
}
