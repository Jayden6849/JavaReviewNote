package ch06;

import java.util.Objects;

public class MyPoint {
    private int x;
    private int y;

    MyPoint() {
        this(0, 0);
    }
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    /* Getter, Setter */
    public int getPointX() {
        return x;
    }
    public int getPointY() {
        return y;
    }
    public void setPointX(int x) {
        this.x = x;
    }
    public void setPointY(int y) {
        this.y = y;
    }

    /* Method Override */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x && y == myPoint.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
