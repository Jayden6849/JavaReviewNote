package ch06;

import java.util.Objects;

public class Student {
    /* Field */
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    /* Constructor */
    Student() {
        this("홍길동", 0, 0, 0, 0, 0);
    }
    Student(String name, int ban, int no) {
        this(name, ban, no, 0, 0, 0);
    }
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    /* Method */
    String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," +
                (kor+eng+math) + "," + (int)((kor+eng+math)/3.0*10.0+0.5)/10.0;
    }
    int getTotal() {
        return kor+eng+math;
    }
    double getAverage() {
        return (int)(getTotal()/3.0*10.0+0.5)/10.0;
    }

    /* Getter, Setter */
    public String getName() {
        return name;
    }
    public int getBan() {
        return ban;
    }
    public int getNo() {
        return no;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }

    /* Method Ovrride */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ban == student.ban && no == student.no && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, ban, no);
    }
    @Override
    public String toString() {
        return name + "(" + ban + ", " + no + ")";
    }
}
