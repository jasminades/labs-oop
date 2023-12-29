package org.example.week11;

import java.util.ArrayList;
import java.util.List;


class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(String type, String size, List<String> toppings) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}


interface CoffeeBuilder {
    void buildType(String type);
    void buildSize(String size);
    void buildToppings(List<String> toppings);
    Coffee getResult();
}


class EspressoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public EspressoBuilder() {
        this.coffee = new Coffee("Espresso", "", new ArrayList<>());
    }

    @Override
    public void buildType(String type) {
        coffee = new Coffee(type, coffee.size, coffee.toppings);
    }

    @Override
    public void buildSize(String size) {
        coffee = new Coffee(coffee.type, size, coffee.toppings);
    }

    @Override
    public void buildToppings(List<String> toppings) {
        coffee = new Coffee(coffee.type, coffee.size, toppings);
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}


class LatteBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public LatteBuilder() {
        this.coffee = new Coffee("Latte", "", new ArrayList<>());
    }

    @Override
    public void buildType(String type) {
        coffee = new Coffee(type, coffee.size, coffee.toppings);
    }

    @Override
    public void buildSize(String size) {
        coffee = new Coffee(coffee.type, size, coffee.toppings);
    }

    @Override
    public void buildToppings(List<String> toppings) {
        coffee = new Coffee(coffee.type, coffee.size, toppings);
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}


class CappuccinoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public CappuccinoBuilder() {
        this.coffee = new Coffee("Cappuccino", "", new ArrayList<>());
    }

    @Override
    public void buildType(String type) {
        coffee = new Coffee(type, coffee.size, coffee.toppings);
    }

    @Override
    public void buildSize(String size) {
        coffee = new Coffee(coffee.type, size, coffee.toppings);
    }

    @Override
    public void buildToppings(List<String> toppings) {
        coffee = new Coffee(coffee.type, coffee.size, toppings);
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}


class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder, String size, List<String> toppings) {
        builder.buildSize(size);
        builder.buildToppings(toppings);
    }
}


public class Main {
    public static void main(String[] args) {

        CoffeeDirector coffeeDirector = new CoffeeDirector();


        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        coffeeDirector.constructCoffee(espressoBuilder, "Medium", List.of("Milk Foam"));
        Coffee espresso = espressoBuilder.getResult();
        System.out.println("Espresso: " + espresso);

        CoffeeBuilder latteBuilder = new LatteBuilder();
        coffeeDirector.constructCoffee(latteBuilder, "Large", List.of("Caramel Syrup", "Whipped Cream"));
        Coffee latte = latteBuilder.getResult();
        System.out.println("Latte: " + latte);

        CoffeeBuilder cappuccinoBuilder = new CappuccinoBuilder();
        coffeeDirector.constructCoffee(cappuccinoBuilder, "Small", List.of("Cocoa Powder"));
        Coffee cappuccino = cappuccinoBuilder.getResult();
        System.out.println("Cappuccino: " + cappuccino);
    }
}
