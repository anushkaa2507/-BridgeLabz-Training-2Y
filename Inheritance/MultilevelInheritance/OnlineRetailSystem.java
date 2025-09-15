
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayInfo() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }

    String getOrderStatus() {
        return "Order placed";
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}


class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}


public class OnlineRetailSystem {
    public static void main(String[] args) {
        Order order = new Order("O101", "2025-09-10");
        ShippedOrder shipped = new ShippedOrder("O102", "2025-09-11", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O103", "2025-09-12", "TRK67890", "2025-09-15");

        order.displayInfo();
        System.out.println(order.getOrderStatus());

        shipped.displayInfo();
        System.out.println(shipped.getOrderStatus());

        delivered.displayInfo();
        System.out.println(delivered.getOrderStatus());
    }
}
