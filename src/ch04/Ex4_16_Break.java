package ch04;

public class Ex4_16_Break {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        while (true){
            if (sum > 100)
                break;
            i++;
            sum += i;
        }

        System.out.printf("i = %d, sum = %d%n", i, sum);
    }
}
