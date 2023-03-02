import java.util.Random;

public class GameMachine {
    ToyStorage storage;

    public GameMachine(ToyStorage storage) {
        this.storage = storage;
    }

    public Toy getPrizeToy() {
        Random random = new Random();
        double totalDropRate = storage.stream().mapToDouble(Toy::getDropRate).sum();
        double randomValue = random.nextDouble() * totalDropRate;
        double currentSum = 0;
        for (Toy toy : storage) {
            currentSum += toy.getDropRate();
            if (randomValue <= currentSum) {
                if (toy.getQuantity() == 0) {
                    System.out.println("No more " + toy.getTitle() + " left.");
                    return null;
                } else {
                    toy.setQuantity(toy.getQuantity() - 1);
                    storage.removeToy(toy);
                   // writeToFile(toy);
                    return toy;
                }
            }
        }
        return null;
}

