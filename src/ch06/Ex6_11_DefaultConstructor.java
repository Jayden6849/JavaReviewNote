package ch06;

public class Ex6_11_DefaultConstructor {
    public static void main(String[] args) {
        Data d1 = new Data();
        // Data2 d2 = new Data2(); // Error = Data에 기본생성자가 없음. 반드시 매개변수가 필요함
        Data2 d2 = new Data2(3);
    }
}
