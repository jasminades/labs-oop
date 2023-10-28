import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);

        System.out.println("Circle Information:");
        circle.displayInfo();
        System.out.println();

        System.out.println("Rectangle Information:");
        rectangle.displayInfo();
    }
}
