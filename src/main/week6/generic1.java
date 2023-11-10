import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum{
    public static void calculateSum(List<? extends Number> numbers){
        double even=0;
        double odd=0;

        for(Number number : numbers){
            double number = num.doubleValue();

            if(number % 2 == 0){
                even+=number;
            }else{
                odd += number;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Sum of odd numbers: " + odd);
    }

    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        List<Double> listOfNumbers = new ArrayList<>();

        System.out.println("enter numbers: ");

        while(reader.hasNextDouble()){
            double num = reader.nextDouble();
            listOfNumbers.add(num);
        }
    }
}