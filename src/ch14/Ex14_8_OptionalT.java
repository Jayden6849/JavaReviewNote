package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8_OptionalT {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.orElse(""));
        System.out.println("optInt = " + optInt.orElse(-1));

        int result1 = Optional.of("123")
                .filter(x->x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-999999999);
        System.out.println(result1);

        int result2 = Optional.of("")
                .filter(x->x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-999999999);
        System.out.println(result2);

        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3 = %d%n", x)); // 값이 있을 때만 출력하자 null이면 시행 자체를 안 함

        OptionalInt optInt1 = OptionalInt.of(0); // 0이 저장됨
        OptionalInt optInt2 = OptionalInt.empty(); // OptinalInt.empty 가 저장됨

        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false

        System.out.println(optInt1.getAsInt());
        // System.out.println(optInt2.getAsInt()); 없는데 메서드를 쓰려고하니까 예외 발생함
        System.out.println("optInt1 = " + optInt1); // OptionalInt[0]
        System.out.println("optInt2 = " + optInt2); // OptinalInt.empty

        System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));
    }
}
