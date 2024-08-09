package Ch12;

enum Dir {
    EAST(1, ">"), SOUTH(2, "v"), WEST(3, "<"), North(4,"^");

    private static final Dir[] DIR_ARR = Dir.values(); // 위의 enum 상수들을 배열로 묶어서 변수 DIR_ARR에 넣어둠
    private final int value;
    private final String symbol;

    Dir(int value, String symbol) { // 생성자는 private고 밖에서 호출할 수 없지만 내가 적을 순 없고 컴파일러가 private 처리해준다.
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }

    /** 다음 of메서드도 getter의 일종으로 작성된 것이다 **/
    public static Dir of(int dir) { // 매개변수 dir이 유효성범위를 벗어날경우 IlligalArgumentException을 발생시키고, 아니라면 DIR_ARR[index] 를 반환한다.
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir-1];
    }

    /** num이 1이면 시계방향으로 1칸 회전 -1이면 반시계방향으로 1칸 회전하는 메서드 **/
    public Dir rotate(int num) {
        num = num%4; // 0, 1, 2, 3 중에 하나를 지녀야함
        if (num < 0) num += 4;

        return DIR_ARR[((value-1)+num)%4];
    }

    @Override
    public String toString() {
        return name() + "(" + getSymbol() + ")";
    }
}

public class Ex12_6_EnumMapping {
    public static void main(String[] args) {
        for (Dir d: Dir.values()) {
            System.out.printf("%s(%s)%n", d.name(), d.getValue());
        }

        Dir d1 = Dir.EAST; // d1 = "EAST"
        Dir d2 = Dir.of(1); // d2 = DIR_ARR[0] = EAST

        System.out.printf("d1 = %s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2 = %s, %d%n", d2.name(), d2.getValue());

        System.out.println(Dir.EAST.rotate(1));
        System.out.println(Dir.EAST.rotate(2));
        System.out.println(Dir.EAST.rotate(-1));
        System.out.println(Dir.EAST.rotate(-2));
    }
}