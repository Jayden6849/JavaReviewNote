package ch03;

import java.util.Scanner;

public class Ex3_15_LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자 하나를 입력하세요 > ");

        ch = sc.next().charAt(0);

        if('0' <= ch && ch <= '9')
            System.out.println("입력하신 문자는 숫자입니다.");
        else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
            System.out.println("입력하신 문자는 영문자입니다.");
    }
}
