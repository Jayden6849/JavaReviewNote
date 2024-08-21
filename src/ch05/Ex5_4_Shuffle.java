package ch05;

import java.util.Arrays;

public class Ex5_4_Shuffle {
    public static void main(String[] args) {
        int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(intArr));

        for (int i=0; i<intArr.length; i++ ) {
            int random = (int)(Math.random()*intArr.length);
            int tmp = intArr[i];
            intArr[i] = intArr[random];
            intArr[random] = tmp;
        }
        System.out.println(Arrays.toString(intArr));
    }
}
