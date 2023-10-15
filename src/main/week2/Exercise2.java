package week2;
import java.util.Scanner;
public class Excercise2 {
    public Excercise2(){
    }
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);
        int sum=0;
        int read;

        System.err.print ("Input first number ");
        read = Integer.parseInt (reader.nextLine ());

        sum+=read;

        System.err.print ("Input second number ");
        read = Integer.parseInt (reader.nextLine ());

        sum+=read;

        System.err.print ("Input third number ");
        read = Integer.parseInt (reader.nextLine ());

        sum+=read;

        System.out.println ("Sum " + sum);

    }
}