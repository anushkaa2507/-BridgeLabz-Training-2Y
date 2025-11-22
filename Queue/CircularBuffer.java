package com.Queue;

public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int head = 0;
    private int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        int index = (head + count) % size;

        if (count == size) {
            buffer[head] = value;
            head = (head + 1) % size;
        } else {
            buffer[index] = value;
            count++;
        }
    }

    public void display() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();
    }
}