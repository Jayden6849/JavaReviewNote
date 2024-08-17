package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9_Reduce {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance",
                "Java",
                "Lambda",
                "stream",
                "OptionalDouble",
                "IntStream",
                "count",
                "sum"
        };

        Stream<String> strStream = Stream.of(strArr);
        strStream.parallel().forEachOrdered(System.out::println);
        // 스트림 닫힘

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0); // 길이가 0인게 하나도 없는거 맞지? true
        // 스트림 닫힘
        System.out.println("noEmptStr = " + noEmptyStr);

        Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst(); // s로 시작하는거 중에서 첫번째꺼 알려줘
        // 스트림 닫힘
        System.out.println("sWord = " + sWord);

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length); // 스트링의 길이를 가지고 스트림을 만들어줘 반환값은 인트야
        // == Stream<Integer> intStream1 = Stream.of(strArr).map(String::length); 위와 완전히 동일함. 속도가 좀 다르겠지?
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        // intStream1 닫힘
        int sum = intStream2.reduce(0, (a, b) -> a + b);
        // intStream2 닫힘

        System.out.println(count); // 스트림에 들어있는 각 요소는 8개
        System.out.println(sum); // 스트림에 들어있는 각 요소의 글자수의 합은 58

        /** intStream3 에 들어있는 모든 값을 싹 뒤져서 (reduce 해가면서) (a, b) -> Integer.max(a,b) 를 찾아냄 */
        OptionalInt max = intStream3.reduce(Integer::max); // Optional<Integer> 에는 담을 수 없게 되어버림 - 왜? map 이 아니라 mapToInt 를 했기 때문
        /** intStream4 에 들어있는 모든 값을 싹 뒤져서 (reduce 해가면서) (a, b) -> Integer.min(a,b) 를 찾아냄 */
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println(max);
        System.out.println(min);
        /** 다 같은거임 */
        System.out.println(max.isPresent() ? max.getAsInt() : -1);
        System.out.println(min.isPresent() ? min.getAsInt() : -1);
        System.out.println(max.orElse(-1));
        System.out.println(min.orElse(-1));
        System.out.println(max.orElseGet(() -> -1));
        System.out.println(min.orElseGet(() -> -1));
    }
}
