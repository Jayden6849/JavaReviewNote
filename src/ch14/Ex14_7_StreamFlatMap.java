package ch14;

import java.util.Arrays;
import java.util.stream.*;

public class Ex14_7_StreamFlatMap {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        // Stream<String> stringStream = strArrStream.map(Arrays::stream) // 리턴값이 String[] 이라 대입할 수 없다고 나옴
        Stream<String> stringStream = strArrStream.flatMap(Arrays::stream);

        stringStream.map(String::toLowerCase)   // 싹 다 소문자로 일단 바꾼 후
                .sorted()                       // String들을 뭉텅이로 전부 줄세운다.
                .distinct()                     // 중복된 값을 전부 없애고
                .forEach(System.out::println);  // abc def ghi jkl 예상함
        System.out.println();

        String[] lineArr = {                    // 이런 글귀들이 있어서 배열로 만들어둠
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        /**
         * 배열의 각 단어들을 일렬로 가져오고 싶단말이지..
         * map으로 가져오면 라인의 주소값이 들어올거 같음
         * flatMap 으로 가져와야할듯
         */

        Stream<String> lineStream = Stream.of(lineArr); // 한 줄 한 줄 그 자체로 일단 스트림을 구성함
        // lineStream.forEach(System.out::println);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // line을 넣어줄테니까 그 라인을 공백 기준으로 잘라서 스트림을 만들어줘
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}