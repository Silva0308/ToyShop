import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/** Это класс склада игрушек*/
public class ToyStorage implements Iterable <Toy> {
    private List<Toy> toyList;

    public ToyStorage() {
        this.toyList = new ArrayList<>();
    }
/** метод добавления игрушки на склад*/
    public void addToy(Toy toy) {
        toyList.add(toy);

    }

    /** метод удаления игрушки со склада*/
    public void removeToy (Toy toy){
        toy.setQuantity(toy.getQuantity()-1);
    }

    /** выводит все игрушки*/
    public void showAll(){
        for (Toy toy: toyList){
            System.out.println(toy);
        }
    }
    /** меняет вес */
    public void changeToyDropRate(int toyId, double newDropRate) {
        for (Toy toy : toyList) {
            if (toy.getId() == toyId) {
                toy.setDropRate(newDropRate);
                return;
            }
        }
        System.out.println("Toy not found.");
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
