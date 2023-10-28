package week2;
public class Exercise7 {
    public Exercise7(){
    }
    public static void main (String [] args){
        printStars (5);
        printStars (3);
        printStars (9);
    }
    private static void printStars (int amount){
        int i=0;
        while (i<=amount){
            System.err.print ("*");
            i++;
        }
        System.err.println ("");
    }
}