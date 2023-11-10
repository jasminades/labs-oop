import java.util.ArrayList;

public class Index {
    public static int indexOfTheSmallest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;

        }

        int smallestNumber = array[0];
        int indexOfSmallestNumber = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                indexOfSmallestNumber = i;
            }
        }

        return indexOfSmallestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 7};
        int indexOfSmallestNumber = indexOfTheSmallestNumber(numbers);

        System.out.println("The smallest number in the array is: " + numbers[indexOfSmallestNumber]);
        System.out.println("The index of the smallest number is: " + indexOfSmallestNumber);
    }
}
