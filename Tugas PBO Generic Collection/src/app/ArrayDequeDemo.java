package app;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> antrian =
                new ArrayDeque<>();

        antrian.add("Alan");
        antrian.add("Budi");
        antrian.add("Ferdi");

        System.out.println("Antrian Pertama : "
                + antrian.poll());

        System.out.println("Sisa Antrian : "
                + antrian);
    }
}