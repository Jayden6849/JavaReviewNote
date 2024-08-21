package ch04;

import java.util.Scanner;

public class Ex4_20_Summary {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner sc = new Scanner(System.in);

        program:
        while(true) {
            System.out.println("=========");
            System.out.println("1. Square");
            System.out.println("2. Square Root");
            System.out.println("3. Log");
            System.out.println();
            System.out.print("원하는 메뉴(1~3)를 선택해주세요.(종료: 0) > ");

            menu = sc.nextInt();

            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1<= menu && menu <=3)) {
                System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }

            calculate:
            while (true) {
                System.out.print("게산할 값을 입력해주세요.(계산종료: 0, 전체종료: 99) > ");
                num = sc.nextInt();

                if (num == 99) {
                    System.out.println("프로그램을 종료합니다.");
                    break program;
                } else if (num == 0) {
                    break;
                }

                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}
