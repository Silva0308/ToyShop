/** Это класс игрушка*/
public class Toy {
    private final int id;
    private String title;
    private int quantity;
    private double dropRate;
    private static int count;

    static {
        count = 0;
    }


    /**
     * Это конструктор
     *
     * @param id   идентификатор игрушки, считается автоматически
     * @param title название
     * @param quantity количество игрушек на складе
     * @param dropRate частота выпадения в розыгрыше
     *
     */
    public Toy(int id, String title, int quantity, double dropRate) {
        this.id = ++count;;
        this.title = title;
        this.quantity = quantity;
        this.dropRate = dropRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDropRate() {
        return dropRate;
    }

    public void setDropRate(double dropRate) {
        this.dropRate = dropRate;
    }

    public int getId() {
        return id;
    }
}
