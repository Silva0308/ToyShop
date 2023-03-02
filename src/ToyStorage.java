import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/** Это класса склада игрушек*/
public class ToyStorage implements Iterable <Toy> {
    private List<Toy> toyList;

    public ToyStorage() {
        this.toyList = new ArrayList<>();
    }
/** метод добавлнеия игрушки на склад*/
    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    /** метод удаления игрушки со склада*/
    public void removeToy (Toy toy){
        toy.setQuantity(toy.getQuantity()-1);
    }

    @Override
    public Iterator<Toy> iterator(){
        return new ToyStorageIterator(this);
    }

    public Toy getToy(int index) {
        return toyList.get(index);
    }

    public int getSize() {
        return toyList.size();
    }
}
