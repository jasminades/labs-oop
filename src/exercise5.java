package week2;
import java.util.Scanner;
public class excercise5 {
    public excercise5(){
    }
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);

        System.err.println ("Type a number");
        int read = reader.nextInt ();

        int sum=0;
        int x=0;
        int result =0;
        while (x <= read){
            sum+= (int) Math.pow (2,x);
            x++;
        }
        System.err.println ("The result is " + sum);
    }
}