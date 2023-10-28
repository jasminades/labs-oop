package week2;
import java.util.Scanner;
public class Excercise3 {
    public Excercise3(){
    }
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);

        int sum=0;
        while (true){
            System.err.println ("Type a number");
            int read = reader.nextInt ();
            if (read==0){
                break;
            }
            sum += read;
            System.out.println ("Sum now: " + sum);
        }
        System.out.println ("Sum in the end: " + sum);
    }
}