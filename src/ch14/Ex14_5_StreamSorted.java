package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5_StreamSorted {
    public static void main(String[] args) {
        /* 스트림의 생성 Stream<Student> studentStream = Stream.of(T values.. ) */
        Stream<Student> studentStream = Stream.of( //
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 100)
        );

        /* 스트림 출력 */
        studentStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Student::getTotalScore)
                        .thenComparing(Student::getName))
                .forEach(System.out::print);
    }
}

class Student implements Comparable<Student> {
    /* member */
    String name;
    int ban;
    int totalScore;

    /* Constructor */
    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    /* Getter */
    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    /* toString */
    @Override
    public String toString() {
        return String.format("[%s %s %d]%n", name, ban, totalScore);
    }

    /* implements */
    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}