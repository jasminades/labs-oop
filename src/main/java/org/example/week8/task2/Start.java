package org.example.week8.task2;

// Start.java
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Double> grades = Arrays.asList(90.5, 85.0, 92.3, 88.7, 95.2);


        Student student = new Student("Jasmina Destanovic", 7, grades);


        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);

        // Use reflection to access and print field names and values of GradeAnalyzer
        Class<?> analyzerClass = gradeAnalyzer.getClass();
        Field[] fields = analyzerClass.getDeclaredFields();
        System.out.println("GradeAnalyzer fields:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(gradeAnalyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Method[] methods = analyzerClass.getDeclaredMethods();
        System.out.println("\nInvoking methods:");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                method.setAccessible(true);
                try {
                    method.invoke(gradeAnalyzer);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

