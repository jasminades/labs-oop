import java.util.ArrayList;

public class Swapping{
    public static void swap(int[] array, int index1, int index2){
        if(array.length==0 || index1<0 ||index1>= array.length || index2<0 || index2 >= array.length ||index1==index2){
            System.out.println("Invalid input! ");
            return;
        }

        int temporaryValue = array[index1];
        array[index1] = array[index2];
        array[index2] = temporaryValue;
    }

    public static void main(String args[]){
        int[] values = {3,2,5,4,8};
        System.out.println(Arrays.toString(values));
        swap(values,1,0);

        System.out.println(Array.toString(value));
        swap(values,1,0);

        System.out.println(Array.toString(valuse));
        swap(values,0,3);
        System.out.println(Arrays.toString(values));
    }
}