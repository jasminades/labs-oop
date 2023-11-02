import java.util.ArrayList;
import java.util.List;

public class Box {
    private double maxWeight;
    private List<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void add(ToBeStored thing) {
        if (thing.weight() + totalWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    private double totalWeight() {
        double weight = 0;
        for (ToBeStored thing : things) {
            weight += thing.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + totalWeight() + " kg";
    }

    public static void main(String[] args) {
        Box box = new Box(10);

        Book book1 = new Book("John Doe", "The Book", 1.5);
        Book book2 = new Book("Jane Doe", "Another Book", 2.0);
        CD cd = new CD("Artist", "CD Title", 2022);

        box.add(book1);
        box.add(book2);
        box.add(cd);

        System.out.println(box);
    }
}
