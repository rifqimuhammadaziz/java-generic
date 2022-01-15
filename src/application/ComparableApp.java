package application;

import util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] peoples = {
                new Person("Rifqi", "Jawa Tengah"),
                new Person("Bagas", "Jawa Barat"),
                new Person("Bayu", "Kalimantan Selatan")
        };

        Arrays.sort(peoples);
        System.out.println(Arrays.toString(peoples));
    }
}
