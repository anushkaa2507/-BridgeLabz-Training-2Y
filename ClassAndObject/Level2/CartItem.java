import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(String name, double price, int qty) {
        cart.add(new CartItem(name, price, qty));
        System.out.println(qty + " x " + name + " added to cart.");
    }

    void removeItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                System.out.println(cart.get(i).itemName + " removed from cart.");
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found in cart!");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getCost();
        }
        System.out.println("Total Cost: " + total);
    }
    
    void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.println("Items in Cart:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - " + item.quantity + " x " + item.price + " = " + item.getCost());
        }
    }

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem("Notebook", 50, 2);
        myCart.addItem("Pen", 10, 5);
        myCart.displayCart();
        myCart.displayTotalCost();

        myCart.removeItem("Pen");
        myCart.displayCart();
        myCart.displayTotalCost();
    }
}
