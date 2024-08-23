package ch06;

import java.util.Objects;

public class Car {
    private final String color;
    private final String gearType;
    private final int numOfDoor;

    Car() {
        this("White", "Auto", 4);
    }

    Car(String color) {
        this(color, "Auto", 4);
    }

    Car(String color, String gearType, int numOfDoor) {
        this.color = color;
        this.gearType = gearType;
        this.numOfDoor = numOfDoor;
    }

    /* Getter : Setter 존재하지 않음 - 객체를 생성할 때만 Set 가능 - 변수들을 final 만들어도 좋을듯 */
    public String getColor() {
        return color;
    }

    public String getGearType() {
        return gearType;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    /* Method Override */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numOfDoor == car.numOfDoor && Objects.equals(color, car.color) && Objects.equals(gearType, car.gearType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gearType, numOfDoor);
    }

    @Override
    public String toString() {
        return "Car{" + color + ", " + gearType + ", " + numOfDoor + "}";
    }
}
