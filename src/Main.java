import model.Customer;
import model.Items;
import model.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Items> items = new ArrayList<>();
        items.add(new Items("item1", 12.5));
        items.add(new Items("item2", 15.0));
        Order order = new Order(items);
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        Customer customer = new Customer(orders);

        for (Items item : order.items) {
            System.out.println("Item name: " + item.name);
            System.out.println("Item price: " + item.price);
        }
        System.out.println("Invoice: " + order.getInvoice());


    }
}
