package ch14;

import java.util.*;

public class PrivEx14_1_NullPointerException {
    public static void main(String[] args) {

        /** NullPointerException 을 회피하기 위한 기법들을 알아볼 예정이다 */

        // String str = null; // 이런식으로 null을 직접 쓰지 않는다 - 에러가 나는건 아니지만 취약함
        String str = "";

        // int[] intArr = null; // 이런식으로 null을 직접 쓰지 않는다 - 에러가 나는건 아니지만 취약함
        int[] intArr1 = {};
        int[] intArr2 = new int[0];

        // Optional<String> optStr = null; // 이런식으로 null을 직접 쓰지 않는다 - 에러가 나는건 아니지만 취약함
        Optional<String> optStr = Optional.empty();

        /** 문제가 없는지 확인해보자 - null로 초기화 했다면 모두 다 NullPointerException 발생했을 동작들임 */
        System.out.println(str.length());
        System.out.println(intArr1.length);
        System.out.println(intArr2.length);
        System.out.println(optStr);

        /** Optional.get()의 예외처리에 대해 알아보자 - Ctrl + Alt + T 예외처리 자동완성 */
        try {
            str = optStr.get();
        } catch (Exception e) {
            str = ""; // NullPointerException 이라면 빈문자열을 출력
        }

        /** Optional.orElse() - 매번 예외처리 하기 귀찮아서 사용하는 메서드 */
        str = optStr.orElse(""); // Null 이면 ""를 반환해줘
        System.out.println(str);

        /** Optional.orElseGet(람다식) - null 일 때 어떻게 할 지 람다식으로 표현 */
        str = optStr.orElseGet(() -> new String()); // null 이면 new String(), 즉 "" 를 반환해줘
        str = optStr.orElseGet(String::new); // 위와 같은 뜻. 메서드 참조
        

    }
}
