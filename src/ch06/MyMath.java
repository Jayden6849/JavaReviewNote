package ch06;

class MyMath {
    MyMath() {};

    static long add(long a, long b) { return a+b; }
    static long add(long a, long b, long c) { return a+b+c; }
    static int add(int[] iArr) {
        int result = 0;
        for (int i=0; i<iArr.length; i++) {
            result += iArr[i];
        }
        return result;
    }

    static long subtract(long a, long b) {
        return a-b;
    }

    static long multiply(long a, long b) {
        return a*b;
    }
    static long multiply(long a, long b, long c) { return a*b*c; }

    static double divide(double a, double b) {
        return a/b;
    }
}
