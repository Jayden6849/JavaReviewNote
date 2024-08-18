package ch02;

public class Ex2_11_Overflow {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1)); // 연산에 있어서는 정수의 승격에 의해 int 계산됨 - (short) 필요한 이유
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));

        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)(--cMin));
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)(++cMax));
    }
}
