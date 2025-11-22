package generic_assignment;
class MaxValue {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T m = x;
        if (y.compareTo(m) > 0) m = y;
        if (z.compareTo(m) > 0) m = z;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(maximum(10, 20, 5));
        System.out.println(maximum(3.5, 2.1, 9.8));
        System.out.println(maximum("apple", "mango", "banana"));
    }
}