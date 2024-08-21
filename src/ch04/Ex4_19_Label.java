package ch04;

public class Ex4_19_Label {
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if(j==5)
                    break;
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        };
    }
}
