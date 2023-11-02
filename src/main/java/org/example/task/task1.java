import java.util.Scanner;
package org.example.task;

public class task1 {
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
}
