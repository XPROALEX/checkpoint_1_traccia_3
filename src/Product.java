public class Product {
    private String name;
    private long id;
    private int quantity;

    public Product(String name, long id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
