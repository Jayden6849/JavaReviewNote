package ch06;

import java.util.Objects;

class Tv {
    private String color;
    private boolean power;
    private int channel;

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

    /* Setter */
    public void setColor(String color) {
        this.color = color;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void power() {
        power = !power;
    }

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
