public class Main {
    public static void main(String[] args) {

        ToyStorage myStorage = new ToyStorage();
        myStorage.addToy(new Toy( "Teddy", 3, 30 ));
        myStorage.addToy(new Toy( "Ball", 6, 50 ));
        myStorage.addToy(new Toy( "Lego", 1, 10 ));
        myStorage.addToy(new Toy( "Barbie", 5, 10 ));

        GameMachine machine = new GameMachine(myStorage);
        for (int i = 0; i < 5; i++) {
            Toy prizeToy = machine.getPrizeToy();
            if (prizeToy == null) {
                break;
            }
            System.out.println("Congratulations! You won a " + prizeToy.getTitle() + ".");
        }
    }
}