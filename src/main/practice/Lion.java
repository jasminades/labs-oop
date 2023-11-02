package org.example;

public class Lion extends Animal{
    int bearLength;

    public int getBearLength(){
        return bearLenght;
    }
    public void setBearLength(){
        this.bearLength = bearLength;
    }

    public Lion(int bearLength, String name){
        super(name);
        this.bearLength=bearLength;
    }

    public String runSound(){
        return "Lion running";
    }
}
