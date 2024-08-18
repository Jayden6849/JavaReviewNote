package ch03;

public class Ex3_4_SignedOperator {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i);

        int j = -10;
        j = -j;
        System.out.println(j);
    }
}
