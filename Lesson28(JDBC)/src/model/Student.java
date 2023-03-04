package model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String major;
    private int fee;
    private LocalDate startDate;
    private LocalDate leaveDate;
    int studentRowInfoId;

    public Student(int id, String name, String surname, String major, int fee, LocalDate startDate, int studentRowInfoId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.major = major;
        this.fee = fee;
        this.startDate = startDate;
        this.studentRowInfoId = studentRowInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getStudentRowInfoId() {
        return studentRowInfoId;
    }

    public void setStudentRowInfoId(int studentRowInfoId) {
        this.studentRowInfoId = studentRowInfoId;
    }

    @Override
    public String toString() {
        return "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", major= " + major + '\'' +
                ", fee= " + fee +
                ", startDate= " + startDate +
                ", leaveDate= " + leaveDate +
                ", studentRowInfoId= " + studentRowInfoId ;
    }
}
