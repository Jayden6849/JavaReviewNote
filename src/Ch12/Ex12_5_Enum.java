package Ch12;

enum Direction {
    EAST, SOUTH, WEST, NORTH
}

public class Ex12_5_Enum {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1==d2 ? " + (d1 == d2)); // false
        System.out.println("d1==d3 ? " + (d1 == d3)); // true - enum을 통해서 타입(Direction, Direction)과 값(EAST, EAST)을 비교하기때문에 ==이 사용가능해짐
        System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // true

        // System.out.println("d2 > d3 ? " + (d2 > d3)); // 사용 불가능함 - 왜? 클래스를 통해 자기자신을 객체화했기때문에 주소값이 따로 있음.

        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3)); // 0 : 같다는 의미
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2)); // -2 : 오른쪽이 2개만큼 더 크다는 의미 - EAST의 인덱스 0 / WEST의 인덱스 2

        switch (d1) { // enum이라는 것을 통해서 객체를 따로 만들었음에도 switch가 정상적으로 작동함을 보여줌
            case EAST:
                System.out.println("The direction is EAST");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH");
                break;
            case WEST:
                System.out.println("The direction is WEST");
                break;
            case NORTH:
                System.out.println("The direction is NORTH");
                break;
            default:
                System.out.println("Invalid direction.");
        }

        Direction[] dArr = Direction.values(); // values() - Direction에 담긴 모든 요소를 배열로 리턴하는 메서드. Enum 클래스에 정의되어있음
        for (Direction d : dArr) { // 열거 순회라고 칭함
            System.out.printf("%s = %d%n", d.name(), d.ordinal()); // 이름과 순번을 출력하고자함
        }
    }
}