package ch03;

public class Ex3_3_IncDecOperator2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;

        System.out.println(i++); // 5가 출력된 후 6으로 증가함
        System.out.println(++j); // 6으로 증가한 후 그 값이 출력됨
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}
