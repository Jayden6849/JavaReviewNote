package ch03;

public class Ex3_11_RoundMethod {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*100)/100.0;

        System.out.println(shortPi);
    }
}
