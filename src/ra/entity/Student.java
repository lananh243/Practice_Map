package ra.entity;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private float average;

    public Student(String studentId, String studentName, int age, float average) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.average = average;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }


    @Override
    public String toString() {
        return "Mã sinh viên: " +this.studentId+ " - Tên sinh viên: " +this.studentName+ " - Tuổi: " +this.age+ " - Điểm trung bình: " +this.average;
    }
}
