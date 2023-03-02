import java.util.Iterator;

public class ToyStorageIterator implements Iterator<Toy> {
    private int index = -1;
    private final ToyStorage storage;

    public ToyStorageIterator(ToyStorage storage) {
        this.storage = storage;
    }


    @Override
    public boolean hasNext() {
        return index < storage.getSize() - 1;
    }

    @Override
    public Toy next() {
        return storage.getToy(++index);
    }
}
