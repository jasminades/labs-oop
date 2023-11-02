package org.example;

public class Animal{
    String name;
    int age;
    Color color;

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age=age;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(){
        this.color=color;
    }

    public Animal(string name){
        this.name=name;
    }
    public Animal(int age){
        this.age=age;
    }

    public Animal(String name, int age, Color color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public String runSound(){
        return "Animal running";
    }
}