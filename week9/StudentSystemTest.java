import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentSystemTest {

    @Test
    void testIfStudentisPresent() {
        assertTrue(studentSystem.getStudentbyID(1).isPresent()); //  Assuming a student with ID 1 is present
    }

    @Test
    void testStudentWithId77() {
        assertFalse(studentSystem.getStudentbyID(77).isPresent()); // Assuming a student with ID 77 is not present
    }

    @Test
    void testStudentNull() {
        assertNull(studentSystem.getStudentbyID(999).orElse(null)); //  Assuming a student with ID 999 is not present
    }

    @Test
    void testHighestGPAStudent() {
        assertEquals(4.0, studentSystem.getHighestGPAStudent().getGPA(), 0.001); // Assuming there is a student with GPA 4.0
    }

    @Test
    void testExceptionForEmptyStudentList() {
        assertThrows(EmptyStudentListException.class, () -> studentSystem.getLongestNameStudent()); // Assuming the student list is empty
    }

    @Test
    void testNamesArray() {
        // Assuming the first five names are ["John", "Bob", "Charlie", "Mark", "Anna"]
        String[] expectedNames = {"John", "Bob", "Charlie", "Mark", "Anna"};
        String[] actualNames = studentSystem.students.stream().map(Student::getName).toArray(String[]::new);
        assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    void testSize() {
        assertEquals(70, studentSystem.students.size()); // Assuming there are 70 students in the list
    }

    @Test
    void testLargestName() {
        assertNotEquals("John Doe", studentSystem.getLongestNameStudent().getName()); // Assuming the student with the longest name is not "John Doe"
    }

    @Test
    void testStudents() {
        // Assuming the student with the highest GPA is not the same as the one with the longest name
        assertNotEquals(studentSystem.getHighestGPAStudent(), studentSystem.getLongestNameStudent());
    }
}
