package generic_assignment;
import java.util.*;

class Fruit {
    String name;
    Fruit(String n) { this.name = n; }
    public String toString() { return name; }
}

class Apple extends Fruit {
    Apple() { super("Apple"); }
}

class Mango extends Fruit {
    Mango() { super("Mango"); }
}

class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();
    public void add(T f) { list.add(f); }
    public void display() {
        for (T f : list) System.out.println(f);
    }
}

class MainFruit {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
}