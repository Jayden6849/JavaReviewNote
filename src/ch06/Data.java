package ch06;

import java.util.Objects;

public class Data {
    /* Field */
    int x;

    /* Constructor */
    Data() {}

    /* Getter, Setter */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /* Method Override */
    @Override
    public String toString() {
        return ""+ x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return x == data.x;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x);
    }
}
