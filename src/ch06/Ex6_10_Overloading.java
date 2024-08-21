package ch06;

public class Ex6_10_Overloading {
    public static void main(String[] args) {
        System.out.println(MyMath.add(5L, 10L));
        System.out.println(MyMath.add(5L, 10L, 20L));

        int[] iArr = new int[]{100, 200, 300};
        System.out.println(MyMath.add(iArr));

        /* 인수와 매개변수 사이의 산술변환때문에 가능한 케이스 */
        System.out.println(MyMath.add(5, 10));
        System.out.println(MyMath.add(5, 10, 20));
    }
}
