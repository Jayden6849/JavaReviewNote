package ch04;

public class Ex4_13_While2 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (true) {
            sum += i;
            if (sum > 100) {
                break;
            }
            i++;
        }
        System.out.println(i); // 14를 더하는 순간 100이 넘음
    }
}
