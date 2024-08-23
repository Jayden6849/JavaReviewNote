package ch06;

import java.util.Objects;

class Tv {
    private String color;
    private boolean power;
    private int channel;
    private int volume;

    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 1;


    Tv() {
        this("Black");
    }
    Tv(String color) {
        this.color = color;
    }

    /* Getter */
    public String getColor() {
        return color;
    }
    public int getChannel() {
        return channel;
    }
    public boolean isPower() {
        return power;
    }
    public int getVolume() {
        return volume;
    }
    public int getMAX_VOLUME() {
        return MAX_VOLUME;
    }
    public int getMIN_VOLUME() {
        return MIN_VOLUME;
    }
    public int getMAX_CHANNEL() {
        return MAX_CHANNEL;
    }
    public int getMIN_CHANNEL() {
        return MIN_CHANNEL;
    }

    /* Setter */
    public void setColor(String color) {
        this.color = color;
    }
    public void setChannel(int channel) {
        if(!(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL)) return;
        this.channel = channel;
    }
    public void channelUp() {
        if (channel < MAX_CHANNEL)
            channel++;
        else
            channel = MIN_CHANNEL;
    }
    public void channelDown() {
        if(channel > MIN_CHANNEL)
            channel--;
        else
            channel = MAX_CHANNEL;
    }
    public void turnOnOff() {
        power = !power;
    }
    public void setVolume(int volume) {
        if(!(MIN_VOLUME <= volume && volume <= MAX_VOLUME)) return;
        this.volume = volume;
    }
    public void volumeUp() {
        if(volume < MAX_VOLUME)
            volume++;
    }
    public void volumeDown() {
        if(MIN_VOLUME < volume)
            volume--;
    }

    /* Method Override */
    @Override
    public String toString() {
        return "Tv";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return power == tv.power && channel == tv.channel && Objects.equals(color, tv.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color, power, channel);
    }
}
