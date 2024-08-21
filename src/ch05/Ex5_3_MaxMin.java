package ch05;

public class Ex5_3_MaxMin {
    public static void main(String[] args) {
        int[] score = {79, 99, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i=0; i<score.length; i++) {
            if (max < score[i]) max = score[i];
            else if (min > score[i]) min = score[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
