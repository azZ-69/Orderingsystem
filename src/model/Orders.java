package model;

import java.util.List;

public class Order {
    public List<Items> items;
    private double total;
    public Order(List<Items> items) {
        this.items = items;
        this.total = calculateTotal();
    }
    private double calculateTotal() {
        double total = 0.0;
        for (Items item : items) {
            total += item.price;
        }
        return total;
    }
    public double getInvoice() {
        return total;
    }
}
