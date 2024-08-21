package ch05;

import java.util.Arrays;

public class Ex5_5_Lotto {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i=0; i<ball.length; i++) {
            ball[i] = i+1;
        }

        for (int i=0; i<6; i++) {
            int random = (int)(Math.random()*ball.length);

            int tmp = ball[i];
            ball[i] = ball[random];
            ball[random] = tmp;
        }

        for (int i=0; i<6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
