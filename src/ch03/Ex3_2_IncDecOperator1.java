package ch03;

public class Ex3_2_IncDecOperator1 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++; // j에 5가 먼저 대입된 후 i값이 증가할 것으로 보임
        System.out.println("(j=i++ 실행 후) i = " + i + ", j = " + j);

        i=5; j=0;

        j = ++i; // i값이 증가한 후 j에 6이 대입될 것으로 보임
        System.out.println("(j=++i 실행 후) i = " + i + ", j = " + j);
    }
}
