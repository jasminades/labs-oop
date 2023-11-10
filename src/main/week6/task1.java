import java.util.ArrayList;

public class ArrayUtils {
    public static int smallest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallestValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }

        return smallestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 7};
        int theSmallestNumber = smallest(numbers);
        System.out.println("The smallest number is: " + theSmallestNumber);
    }
}
