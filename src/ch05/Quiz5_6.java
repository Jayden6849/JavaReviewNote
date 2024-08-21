package ch05;

import java.util.Scanner;

public class Quiz5_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j=0; j<question.length; j++) {
                int r = (int)(Math.random()*question.length);

                char tmp = question[i];
                question[i] = question[r];
                question[r] = tmp;
            }

            System.out.printf("Q%d. %s는 무엇일까요? ", i+1, new String(question));
            String answer = sc.nextLine();

            if (words[i].equals(answer.trim()))
                System.out.println("정답입니다.\n");
            else
                System.out.println("틀렸습니다.\n");
        }
    }
}
