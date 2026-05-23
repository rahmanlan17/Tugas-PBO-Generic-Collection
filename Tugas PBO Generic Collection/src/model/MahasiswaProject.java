package model;

import interfacee.Cetak;

public class MahasiswaProject
        extends Person
        implements Cetak {

    private String nim;

    public MahasiswaProject(
            String nama,
            String nim){

        super(nama);
        this.nim = nim;
    }

    @Override
    public void tampil() {

        System.out.println("Nama : "
                + nama);

        System.out.println("NIM : "
                + nim);
    }

    @Override
    public void printData() {
        tampil();
    }
}