package ch04;

public class Ex4_12_While1 {
    public static void main(String[] args) {
        int i = 5;

        while (i-- != 0) { // 5, 4, 3, 2, 1 총 5번 실행하겠음
            System.out.println(i + " - I can do it");
        }
    }
}
