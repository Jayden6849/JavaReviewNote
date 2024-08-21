package ch05;

public class Ex5_2_SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i<score.length; i++) {
            if(score.length == 0 || score == null) {
                System.out.println("점수 입력이 제대로 되었는지 확인이 필요합니다.");
                break;
            }
            sum += score[i];
        }

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + sum/(double)score.length);
    }
}
