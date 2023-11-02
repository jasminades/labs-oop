package boxes;

public class BlackHoleBox extends Box {

    @Override
    public void add(Thing thing) {
        super.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
