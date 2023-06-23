package StreamsExamples;

public class Student {
    int roll;
    int marks;
    String name;

    public Student(int r ,String n, int m) {
        this.roll=r;
        this.name = n;
        this.marks=m;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
