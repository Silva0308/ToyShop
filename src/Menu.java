import java.util.Scanner;
/**
 * Это класс меню. Позволяет выбрать действие
 */
public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. посмотреть игрушки на складе
                2. провести розыгрыш
                3. изменить вес игрушки
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }
}
