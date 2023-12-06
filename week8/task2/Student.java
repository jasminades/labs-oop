package org.example.week8.task2;


public class Student {
    private String name;
    private int id;
    private List<Double> grades;

    public Student(String name, int id, List<Double> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Grades: " + grades);
    }
}
