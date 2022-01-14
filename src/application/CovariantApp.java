package application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        /**
         * Covariant (Substitute child to parent) : String to Object
         * Read-Only Data (Cannot Write/Change data value)
         */
        MyData<String> stringMyData = new MyData<>("Xenosty");
        process(stringMyData); // covariant

        // use 'process' method or this
        // MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
        // myData.setData(1); // ERROR, Dangerous type
    }
}
