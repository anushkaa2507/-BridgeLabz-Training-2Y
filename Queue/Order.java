package com.Queue;

public class Order {

    private String orderId;
    private String customerName;
    private double amount;

    public Order(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order o = (Order) obj;
        return this.orderId.equals(o.orderId);
    }

    @Override
    public int hashCode() {
        return orderId.hashCode();
    }

    @Override
    public String toString() {
        return "[OrderID=" + orderId + ", Customer=" + customerName + ", Amount=" + amount + "]";
    }
}