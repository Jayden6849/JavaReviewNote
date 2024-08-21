package ch04;

import java.util.Scanner;

public class Ex4_6_Switch {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 > ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("현재 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 가을입니다.");
                break;
            default:
                System.out.println("현재 겨울입니다.");
        }
    }
}
