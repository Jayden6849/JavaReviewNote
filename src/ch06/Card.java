package ch06;

import java.util.Objects;

class Card {
    private final static int WIDTH = 100;
    private final static int HEIGHT = 250;
    private String kind;
    private int number;

    Card() {
        this("Spade", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    /* Getter, Setter */
    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /* Method Override */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number && Objects.equals(kind, card.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public String toString () {
        return "[" + kind + ", " + number + "]";
    }
}
