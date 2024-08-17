package ch14;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Stude {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Stude() {
        this("홍길동", true , 0, 0, 0);
    }
    Stude(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() { return name; }
    public boolean getIsMale() { return isMale; }
    public int getHak() { return hak; }
    public int getBan() { return ban; }
    public int getScore() { return score; }

    @Override
    public String toString() {
        return String.format("[%s(%s), %d학년 %d반, %3d점]%n", name, isMale ? "남" : "여", hak, ban, score);
    }

    enum LEVEL {
        HIGH, MID, LOW
    }
}

public class Ex14_10_PartitioningBy {
    public static void main(String[] args) {
        Stude[] stdArr = {
                new Stude("나자바", true, 1, 1, 300),
                new Stude("김지미", false, 1, 1, 250),
                new Stude("김자바", true, 1, 1, 20),
                new Stude("이지미", false, 1, 2, 150),
                new Stude("남자바", true, 1, 2, 100),
                new Stude("안지미", false, 1, 2, 50),
                new Stude("황지미", false, 1, 3, 100),
                new Stude("강지미", false, 1, 3, 150),
                new Stude("이자바", true, 1, 3, 200),
                new Stude("나자바", true, 2, 1, 300),
                new Stude("김지미", false, 2, 1, 250),
                new Stude("김자바", true, 2, 1, 200),
                new Stude("이지미", false, 2, 2, 150),
                new Stude("남자바", true, 2, 2, 100),
                new Stude("안지미", false, 2, 2, 50),
                new Stude("황지미", false, 2, 1, 100),
                new Stude("강지미", false, 2, 1, 150),
                new Stude("이자바", true, 2, 1, 200),
        };
        /* 단순 분할 - 성별로 분할 */
        System.out.println("1. 단순 분할 - 성별로 분할");
        Map<Boolean, List<Stude>> stuBySex = Stream.of(stdArr)
                .collect(partitioningBy(Stude::getIsMale));

        List<Stude> maleStudent = stuBySex.get(true);
        List<Stude> femaleStudent = stuBySex.get(false);

        for (Stude stude : maleStudent) { System.out.print(stude); }
        for (Stude stude : femaleStudent) { System.out.print(stude); }

        System.out.println();
        /* 단순 분할 - 통계(성별 학생 수) */
        System.out.println("2. 단순 분할 - 통계(성별 학생 수)");
        Map<Boolean, Long> stuNumBySex = Stream.of(stdArr)
                .collect(partitioningBy(Stude::getIsMale, counting())); // key true 에는 true인 녀석들의 숫자가 counting() 되어있을 것임

        System.out.println("남학생 수 : " + stuNumBySex.get(true)); // stuNumBySex 맵에서 key가 true인 value을 출력해줘.
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        /* 단순 분할 - 통계(성별 1등) */
        System.out.println("3. 단순 분할 = 통계(성별 1등)");
        Map<Boolean, Optional<Stude>> topScoreBySex = Stream.of(stdArr)
                .collect(partitioningBy(Stude::getIsMale, maxBy(comparingInt(Stude::getScore))));

        System.out.println("남학생 1등: " + topScoreBySex.get(true));
        System.out.println("여학생 1등: " + topScoreBySex.get(false));

        /* 다중 분할 - 성별 불합격자, 100점 이하 */
        System.out.println("4. 다중 분할 - 성별 불합격자, 100점 이하");
        Map<Boolean, Map<Boolean, List<Stude>>> failedStudBySex = Stream.of(stdArr)
                .collect(partitioningBy(Stude::getIsMale, partitioningBy(s->s.getScore() <= 100)));

        List<Stude> failedMaleStude = failedStudBySex.get(true).get(true); // 조건이 2개인 것
        List<Stude> failedFemaleStude = failedStudBySex.get(false).get(true); // 조건이 2개인 것

        for (Stude stude : failedMaleStude) {
            System.out.print(stude);
        }
        for (Stude stude : failedFemaleStude) {
            System.out.print(stude);
        }
    }
}
