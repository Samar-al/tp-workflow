package tp.workflow.bo;

public class Article {
    private String name;
    private double unitPrice;
    private int quantity;

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
