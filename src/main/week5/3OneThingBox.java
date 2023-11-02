package boxes;

public class OneThingBox extends Box {

    @Override
    public void add(Thing thing) {
        if (getThings().isEmpty()) {
            super.add(thing);
        }
    }
}
