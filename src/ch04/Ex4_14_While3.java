package ch04;

import java.util.*;

/**
 * 입력된 숫자의 각 자리 수의 합을 출력해주는 문제입니다.
 * 나머지가 0이되면 덧셈이 종료되고 값이 출력됩니다.
 */

public class Ex4_14_While3 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.print("숫자를 입력하세요 > ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0)
        {
            sum += num%10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
