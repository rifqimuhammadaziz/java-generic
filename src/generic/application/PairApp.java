package generic.application;

import generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Rifqi", 23);
        System.out.println(pair.getFirst()); // String
        System.out.println(pair.getSecond()); // Integer
    }
}
