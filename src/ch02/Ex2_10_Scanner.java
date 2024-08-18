package ch02;

import java.util.*;

public class Ex2_10_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 자리 정수를 입력해주세요 > ");
        String input = sc.next();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}
