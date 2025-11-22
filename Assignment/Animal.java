package generic_assignment;
import java.util.*;

class Animal {
    String name;
    Animal(String n) { name = n; }
    public String toString() { return name; }
}

class Dog extends Animal {
    Dog(String n) { super(n); }
}

class Cat extends Animal {
    Cat(String n) { super(n); }
}

class AnimalHierarchy {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Dog1"), new Dog("Dog2"));
        List<Cat> cats = Arrays.asList(new Cat("Cat1"), new Cat("Cat2"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}