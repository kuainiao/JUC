package com.example.demo;

public class Student {

    private String name;
    private String old;
    private String salary;
    private String score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                ", salary='" + salary + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
