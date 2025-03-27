package tp.workflow.bo;

public class Article {
    private final String name;
    private final double unitPrice;
    private final int quantity;

    public Article(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
