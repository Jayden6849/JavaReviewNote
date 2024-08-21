package ch05;

import java.util.Arrays;

public class Ex5_1_Array {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr4 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd', 'e'};

        for (int i=0; i<iArr1.length; i++) {
            iArr1[i] = i+1; // iArr1 각 요소에 1 2 3 4 5 를 차례로 저장
        }

        for (int i=0; i<iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1; // iArr2 각 요소에 1~10 랜덤값을 저장
        }

        for (int i=0; i<iArr1.length; i++) {
            if (i==(iArr1.length-1)) {
                System.out.print(iArr1[i]);
            } else {
                System.out.print(iArr1[i] + ", ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
