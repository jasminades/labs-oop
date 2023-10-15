package week2;
import java.util.Scanner;
public class Exercise4 {
    public Exercise4(){
    }
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);
        int num1;
        int num2;

        System.err.print ("Input first number ");
        num1= reader.nextInt ();


        System.err.print ("Input last number ");
        num2= reader.nextInt();

        while (num1<=num2){
            System.out.println (num1);
            num1++;

        }
    }
}