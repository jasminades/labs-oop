import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        this.students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());

            for (String line : lines) {
                String[] parts = line.split(",");
                int ID = Integer.parseInt(parts[0]);
                String name = parts[1];
                String university = parts[2];
                String department = parts[3];
                double GPA = Double.parseDouble(parts[4]);

                Student student = new Student(ID, name, university, department, GPA);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Optional<Student> getStudentbyID(int ID) {
        return students.stream().filter(student -> student.getID() == ID).findFirst();
    }

    public Student getHighestGPAStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("The list is empty.");
        }
        return students.stream().max(Comparator.comparingDouble(Student::getGPA)).orElseThrow();
    }

    public Student getLongestNameStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("The list is empty.");
        }

        return students.stream().max(Comparator.comparingInt(student -> student.getName().length())).orElseThrow();
    }

    public static void main(String[] args) {
        String filename = "students.csv"; // Make sure this matches your actual file name
        StudentSystem studentSystem = new StudentSystem(filename);

        studentSystem.students.forEach(System.out::println);

        try {
            Optional<Student> studentByID77 = studentSystem.getStudentbyID(77);

            if (studentByID77.isPresent()) {
                System.out.println("The student with that id is: " + studentByID77.get());
            } else {
                throw new StudentNotFoundException("The student with ID 77 is not found.");
            }
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Student with the highest GPA: " + studentSystem.getHighestGPAStudent());
        } catch (EmptyStudentListException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Student with the longest name: " + studentSystem.getLongestNameStudent());
        } catch (EmptyStudentListException e) {
            e.printStackTrace();
        }
    }
}
