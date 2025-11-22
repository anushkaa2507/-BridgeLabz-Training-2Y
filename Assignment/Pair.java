package generic_assignment;

class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Deepti", 20);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}