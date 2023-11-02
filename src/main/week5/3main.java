package boxes;

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Box genericBox = new Box();
        Box maxWeightBox = new MaxWeightBox(10);
        Box oneThingBox = new OneThingBox();
        Box blackHoleBox = new BlackHoleBox();

        // Downcasting with instanceof
        if (genericBox instanceof MaxWeightBox) {
            MaxWeightBox castedMaxWeightBox = (MaxWeightBox) genericBox;
            // Use castedMaxWeightBox...
        }

        if (genericBox instanceof OneThingBox) {
            OneThingBox castedOneThingBox = (OneThingBox) genericBox;
            // Use castedOneThingBox...
        }

        if (genericBox instanceof BlackHoleBox) {
            BlackHoleBox castedBlackHoleBox = (BlackHoleBox) genericBox;
            // Use castedBlackHoleBox...
        }
    }
}
