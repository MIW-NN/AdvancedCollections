package model;

/**
 * @author Vincent Velthuizen
 * A simple class to be used to demo the datastructures
 */
public class Student {
    private int studentNumber;
    private String name;

    public Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return studentNumber == student.studentNumber;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return String.format("%d", this.studentNumber);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }
}
