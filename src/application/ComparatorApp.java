package application;

import util.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Person[] peoples = {
                new Person("Rifqi", "Jawa Tengah"),
                new Person("Bagas", "Jawa Barat"),
                new Person("Bayu", "Kalimantan Selatan")
        };

        // to sorting where the class cannot be changed
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(peoples, comparator);
        System.out.println(Arrays.toString(peoples));
    }
}
