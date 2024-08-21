package ch05;

public class Ex5_8_Array2D2 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        /* 과목별 총점 */
        int KorTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==============================");

        for (int i=0; i<score.length; i++) {
            System.out.printf("%3d",i+1);

            /* 개인별 총점 및 평균 */
            int sum = 0;
            double average = 0;

            KorTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j=0; j<score[i].length; j++) {
                System.out.printf("%5d", score[i][j]);
                sum += score[i][j];
            }
            average = sum / (double) score[i].length;
            System.out.printf("%5d %5.1f%n", sum, average);
        }
        System.out.println("==============================");
        System.out.printf("총점: %3d %4d %4d%n", KorTotal, engTotal, mathTotal);
    }
}
