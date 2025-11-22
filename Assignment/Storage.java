package generic_assignment;
import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String n) { name = n; }
    public String toString() { return name; }
}

class ElectronicsItem extends WarehouseItem {
    ElectronicsItem(String n) { super(n); }
}

class GroceriesItem extends WarehouseItem {
    GroceriesItem(String n) { super(n); }
}

class FurnitureItem extends WarehouseItem {
    FurnitureItem(String n) { super(n); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list) System.out.println(i);
    }

    public static void main(String[] args) {
        Storage<ElectronicsItem> s1 = new Storage<>();
        s1.addItem(new ElectronicsItem("TV"));
        s1.addItem(new ElectronicsItem("Laptop"));

        Storage<GroceriesItem> s2 = new Storage<>();
        s2.addItem(new GroceriesItem("Rice"));
        s2.addItem(new GroceriesItem("Oil"));

        Storage<FurnitureItem> s3 = new Storage<>();
        s3.addItem(new FurnitureItem("Chair"));
        s3.addItem(new FurnitureItem("Table"));

        displayAll(s1.getItems());
        displayAll(s2.getItems());
        displayAll(s3.getItems());
    }
}