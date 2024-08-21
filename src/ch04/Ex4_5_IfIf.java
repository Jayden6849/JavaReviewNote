package ch04;

import java.util.Scanner;

public class Ex4_5_IfIf {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.print("점수를 입력해 주세요 > ");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        sc.close();

        System.out.printf("당신의 점수는 %d점입니다.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            grade = 'D';
            if (score >= 68) {
                opt = '+';
            } else if (score < 64) {
                opt = '-';
            }
        }

        System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
    }
}
