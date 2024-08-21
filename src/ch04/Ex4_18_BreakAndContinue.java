package ch04;

import java.util.Scanner;

public class Ex4_18_BreakAndContinue {
    public static void main(String[] args) {
        int num = 0, menu = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1) Square");
            System.out.println("(2) Square Root");
            System.out.println("(3) Log");

            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료: 0) > ");
            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else {
                System.out.println("입력하신 메뉴는 " + menu + "번입니다.");
                break;
            }
        }
    }
}
