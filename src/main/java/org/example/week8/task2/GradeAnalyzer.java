package org.example.week8.task2;


import java.util.List;

public class GradeAnalyzer {
    private List<Double> grades;

    public GradeAnalyzer(List<Double> grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        System.out.println("Average Grade: " + average);
        return average;
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        for (Double grade : grades) {
            System.out.println("Grade: " + grade);
        }
    }
}

