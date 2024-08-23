package ch06;

import java.util.Objects;

public class Marine {
    /* Field */
    private int x;
    private int y;
    private final int hp;
    private static int weapon = 6;
    private static int armor = 0;

    /* Constructor */
    Marine() {
        this(0, 0);
    }
    Marine(int x, int y) {
        this.x = x;
        this.y = y;
        this.hp = 60;
    }

    /* Getter, Setter */
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getHp() {
        return hp;
    }
    public int getWeapon() {
        return weapon;
    }
    public int getArmor() {
        return armor;
    }
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void weaponUp() {
        weapon++;
    }
    public static void armorUp() {
        armor++;
    }

    /* Method Override */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marine marine = (Marine) o;
        return x == marine.x && y == marine.y && hp == marine.hp && weapon == marine.weapon && armor == marine.armor;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, hp, weapon, armor);
    }

    @Override
    public String toString() {
        return "Marine";
    }
}
