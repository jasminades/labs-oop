package people;

class Student extends Person {
    private String studentId;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        super(name, address);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please provide a grade within the range 0-100.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Student ID: " + studentId + "\n  Grades: " + grades;
    }
}
