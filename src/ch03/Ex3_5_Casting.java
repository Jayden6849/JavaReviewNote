package ch03;


public class Ex3_5_Casting {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d; // 85 - 값손실이 발생
        System.out.println("d = " + d);
    }
}
