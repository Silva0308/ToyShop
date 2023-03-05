import java.util.Random;
/**
 * Это класс розыгрыша
 */
public class GameMachine {
    ToyStorage storage;

    public GameMachine(ToyStorage storage) {
        this.storage = storage;
    }

    public Toy getPrizeToy() {
        Random random = new Random();
        double totalDropRate = 0;
        for (Toy toy : storage){
           totalDropRate += toy.getDropRate();
        }
        double randomValue = random.nextDouble() * totalDropRate;
        double currentSum = 0;
        for (Toy toy : storage) {
            currentSum += toy.getDropRate();
            if (randomValue <= currentSum) {
                if (toy.getQuantity() == 0) {
                    System.out.println("No more " + toy.getTitle() + " left."); //уходит в минус???
                    return null;
                } else {
                    toy.setQuantity(toy.getQuantity() - 1); //Врет
                    storage.removeToy(toy);
                    System.out.println(toy);
                   // writeToFile(toy);
                    return toy;
                }
            }
        }
        return null;
}
}

