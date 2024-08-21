package ch04;

/**
 * 1~10 중 3의 배수를 제외하고 출력하는 예제입니다.
 */

public class Ex4_17_Continue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if(i%3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
