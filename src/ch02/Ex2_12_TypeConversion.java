package ch02;

public class Ex2_12_TypeConversion {
    public static void main(String[] args) {
        int i1 = 5;
        char ch1 = 'a';
        char ch2 = '8';
        char[] chArr = {'a', 'b', 'c'};
        String str1 = "321";
        String str2 = "a";

        /* 숫자 -> 문자 */
        System.out.println(i1 + '0'); // 이런식으로 하면 안 됨 - 왜? 계산은 항상 정수의 승격에 의해 int 이루어짐
        System.out.println((char)(i1 + '0'));

        /* 문자 -> 숫자 */
        System.out.println(ch2 - '0');

        /* 숫자 -> 문자열 */
        System.out.println(i1 + "");
        System.out.println(String.valueOf(i1));

        /* 문자열 -> 숫자 */
        System.out.println(Integer.parseInt(str1)); // int
        System.out.println(Integer.valueOf(str1)); // Integer

        /* 문자 -> 문자열 */
        System.out.println(ch1+"");
        System.out.println(String.valueOf(ch1));
        System.out.println(Character.toString(ch1));

        /* 문자열 -> 문자 */
        System.out.println(str2.charAt(0));

        /* 문자배열 -> 문자열 */
        System.out.println(new String(chArr));

        /* 문자열 -> 문자배열 */
        System.out.println(str1.toCharArray());
    }
}
