import java.util.Scanner;
/**
 * Это класс взаимодействия с пользователем. Запускает функции в зависимости от выбранного пункта меню
 */
public class UserInterface {
    private final Scanner scanner;
    private final Menu menu;
    private final ToyStorage storage;
    private final GameMachine machine;
    /**
     *  тут идут пути записи склада и выигранной игрушки в файл, но я торможу, куда сейвер прикрутить
     */
    protected static String storagePath ="/Users/test/Documents/Программирование/Промежуточная аттестация/JAVA/ToyShop/src/Storage.json";
    protected static String prisesPath = "/Users/test/Documents/Программирование/Промежуточная аттестация/JAVA/ToyShop/src/Prises.json";

    public UserInterface(Scanner scanner, Menu menu, ToyStorage storage, GameMachine machine) {
        this.scanner = scanner;
        this.menu = menu;
        this.storage = storage;
        this.machine = machine;
    }
    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1": // посмотреть склад
                    storage.showAll();
                    break;
                case "2": // провести розыгрыш
                    Toy prizeToy = machine.getPrizeToy();
                    System.out.println("Congratulations! You won a " + prizeToy.getTitle() + ".");
                    break;
                case "3": // поменять вес игрушки. Тут надо дописать исключения
                    storage.showAll();
                    System.out.println("Введите Id: ");
                    int id = scanner.nextInt();
                    System.out.println("Введите новый вес: ");
                    double dropRate = scanner.nextDouble();
                    storage.changeToyDropRate(id, dropRate);
                    break;
                case "0": // выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

}
