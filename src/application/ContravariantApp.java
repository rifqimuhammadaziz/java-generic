package application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        /**
         * Contravarian (Substitute parent  to child) : Object to String
         *
         */
        MyData<Object> objectMyData = new MyData<>("Xenosty"); // valid (String is child from Object)
        objectMyData.setData(1000); // valid (Integer is child from Object)

        MyData<? super String> myData = objectMyData; // contravariant

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value = myData.getData(); // valid (value type is Object, and myData is Object)
        System.out.println("Process parameter " + value);
        myData.setData("Xenosty New");
    }
}
