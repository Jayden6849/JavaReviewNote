package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_10_Array2D3 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer","컴퓨터"},
                {"integer", "정수"}
        };

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
            String input = sc.nextLine();

            if (words[i][1].equals(input))
                System.out.println("정답입니다!!\n");
            else
                System.out.println("틀렸습니다... 정답은 " + words[i][0] + "입니다.\n");
        }

        sc.close();
    }
}
