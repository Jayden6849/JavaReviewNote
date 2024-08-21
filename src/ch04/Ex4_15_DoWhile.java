package ch04;

import java.util.Scanner;

/**
 *  임의의 값을 반환받아두고 입력된 값이 그 값과 같아질 때까지 반복문을 도는 예제입니다.
 */

public class Ex4_15_DoWhile {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random()*100) + 1; // 1~100


        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("1~100 정수를 입력해주세요 > ");
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("입력하신 값보다 작은 값입니다. 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("입력하신 값보다 큰 값입니다. 다시 시도해보세요.");
            } else {
                System.out.println(answer + " 정답입니다!");
                break;
            }
        } while (input != answer);

        sc.close();
    }
}
