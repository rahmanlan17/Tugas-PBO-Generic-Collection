package app;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> mahasiswa =
                new ArrayList<>();

        mahasiswa.add("Alan");
        mahasiswa.add("Budi");
        mahasiswa.add("Ferdi");

        for(String nama : mahasiswa){
            System.out.println(nama);
        }
    }
}