public org.example;

public class Main{
    public static void main(String[] args){

        Animal animal = new Animal (name:"Animal", age:3, Color .RED);
        Tiger tiger = new Tiger(numOfTeeth: 30, name:"Tony", age:5, color .White)
        Lion lion = new Lion(bearLength:50, name:"King");

        System.out.println(animal.runSound());
        System.out.println(lion.runSound());
        System.out.println(tiger.runSound());
    }
}