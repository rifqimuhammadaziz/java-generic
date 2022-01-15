package application;

import generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        // without info generic <> (error at app running, not in compiling)
        MyData myData = new MyData("Xenosty");

        // conversion error
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
