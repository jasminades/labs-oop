import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] array = {-3 ,2, 3, 4, 7, 8, 12};
        Scanner reader=new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Entered search number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        if(result) {
            System.out.println("Value " + searchedValue + " is in the array");
        }
        else{
            System.out.println("Value " + searchedValue + " is not in the array");
        }
    }
}

class BinarySearch{
    public static boolean search(int[] array, int searchedValue){
        int left=0;
        int right = array.length -1 ;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(array[mid] == searchedValue){
                return true;
            }else if(array[mid] < searchedValue){
                left=mid+1;
            }else{
                right = mid -1;
            }
        }
        return false;
    }
}