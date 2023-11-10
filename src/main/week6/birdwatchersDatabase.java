import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase{
    private ArrayList<Bird> birds;
    private Scanner reader;

    public BirdDatabase(){
        this.birds=new ArrayList<>();
        this.reader = new Scanner(System.in);
    }
    public void run(){
        while(true){
            System.out.println("? ");
            String command = this.reader.nextLine();

            if(command.equalsIgnoreCase("Quit")){
                break;
            }else if(command.equalsIgnoreCase("Add")){
                addBird();
            }else if(command.equalsIgnoreCase("Observation")){
                addObservation();
            }else if(command.equalsIgnoreCase("Statistics")){
                printStatistics();
            }else if(command.equalsIgnoreCase("Show")){
                showBird();
            }else{
                System.out.println("Invalid command! ");
            }
        }
    }

    private void addBird(){
        System.out.println("Name: ");
        String name = this.reader.nextLine();
        System.out.println("Latin name: ");
        String latinName= this.reader.nextLine();

        this.birds.add(new Bird(name, latinName));

    }

    private void addObservation(){
        System.out.println("Bird? ");
        String name = this.reader.nextLine();
        Bird bird = findBirdByName(name);

        if(bird != null){
            bird.observe();}
        else{
            System.out.println("not a bird!");
        }
    }
    private void printStatistics(){
        for(Bird bird : this.bird){
            System.out.println(bird);
        }
    }
    private void showBird(){
        System.out.println("Bird? ");
        String name = this.reader.nextLine();
        Bird bird = findBirdByName(name);

        if(bird != null) {
            System.out.println(bird);
        }else{
            System.out.println("not a bird! ");
        }
    }
    private Bird findBirdByName(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equalsIgnoreCase(name)){
                return bird;
            }
        }
        return null;
    }
    public static void main(String[] args){
        BirdDatabase database = new BirdDatabase();
        database.run();
    }
}

class Bird{
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observation=0;
    }

    public String getName(){
        return this.name;
    }
    public void observe(){
        this.observation++;
    }

    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
}