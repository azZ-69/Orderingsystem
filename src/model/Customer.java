package model;

import java.util.List;

public class Customer {
    private List<Order> orders;
    public Customer(List<Order> orders) {
        this.orders = orders;
    }
}
