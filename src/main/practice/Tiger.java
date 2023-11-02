package org.example;

public class Tiger extends Animal{
    int numOfTeeth;

    public int getNumOfTeeth(){
        return numOfTeeth;
    }

    public void setNumOfTeeth(){
        this.numOfTeeth=numOfTeeth;
    }

    public Tiger(int numOfTeeth, String name, int age, Color color){
        super(name,age,color);
        this.numOfTeeth=numOfTeeth;
    }

    
    public String runSound(){
        return "Tiger running";
    }
}