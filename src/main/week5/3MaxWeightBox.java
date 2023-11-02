package boxes;

public class MaxWeightBox extends Box {
    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= maxWeight) {
            super.add(thing);
        }
    }
}
