package week2;
import java.util.Scanner;
public class excercise1 {
    public excercise1 (){

    }

    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);
        String s = ("secret");
        while (true){
            System.err.println ("Type the password");
            String password =reader.nextLine ();

            if (password.equals ("secret")){
                System.err.println ("You are right");
                break;
            }
        }
        System.err.println ("The secret is " + s);
        reader.close ();

    }
}