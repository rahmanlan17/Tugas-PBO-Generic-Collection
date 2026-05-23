package app;

import java.util.ArrayList;
import model.MahasiswaProject;

public class Main {

    public static void main(String[] args) {

        ArrayList<MahasiswaProject> list =
                new ArrayList<>();

        list.add(
                new MahasiswaProject(
                        "Alan",
                        "01101"));

        list.add(
                new MahasiswaProject(
                        "Budi",
                        "01102"));

        for(MahasiswaProject m : list){
            m.printData();
            System.out.println();
        }
    }
}