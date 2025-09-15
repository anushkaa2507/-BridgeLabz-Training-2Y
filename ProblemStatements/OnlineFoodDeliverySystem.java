
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}


abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private double totalPrice;

   
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    
    public abstract void calculateTotalPrice();

   
    public void getItemDetails() {
        System.out.println("Item: " + itemName +
                           ", Price per unit: " + price +
                           ", Quantity: " + quantity +
                           ", Total Price: " + totalPrice);
    }
}


class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void calculateTotalPrice() {
        setTotalPrice(getPrice() * getQuantity()); 
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountAmount = getTotalPrice() * (percentage / 100);
        setTotalPrice(getTotalPrice() - discountAmount);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount applied.";
    }
}


class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 50; 

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void calculateTotalPrice() {
        setTotalPrice((getPrice() * getQuantity()) + (nonVegCharge * getQuantity()));
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountAmount = getTotalPrice() * (percentage / 100);
        setTotalPrice(getTotalPrice() - discountAmount);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg item discount applied.";
    }
}


public class OnlineFoodDeliverySystem {
    
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.calculateTotalPrice();
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10); 
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Final Price after discount: " + item.getTotalPrice());
            }
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] order = {f1, f2};

        processOrder(order);
    }
}
