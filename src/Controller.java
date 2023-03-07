import java.util.Scanner;
/**
 * Это класс, котрый собирает все сущности
 * */
public class Controller {
    public static void run() {
        ToyStorage myStorage = new ToyStorage();
        Toy t1 = new Toy("Teddy", 3, 0);
        Toy t2 = new Toy("Ball", 6, 100);
        Toy t3 = new Toy("Lego", 1, 0);
        Toy t4 = new Toy("Barbie", 5, 0);
        myStorage.addToy(t1);
        myStorage.addToy(t2);
        myStorage.addToy(t3);
        myStorage.addToy(t4);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        GameMachine myMachine = new GameMachine(myStorage);
        UserInterface us = new UserInterface(scanner, menu,myStorage,myMachine);
        us.start();
    }


}
