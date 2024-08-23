package ch06;

public class Quiz6_3 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println("이름 : " + s.getName());
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}
