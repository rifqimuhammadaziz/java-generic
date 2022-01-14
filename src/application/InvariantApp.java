package application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        /**
         * Invariant
         * Use object with different generic parameter cause error
         * example : create generic parameter with string, but the object instance using integer
         * must : create generic parameter with string and create object instance with string generic parameter
         */

        // CHILD to PARENT (String to Object)
        MyData<String> stringMyData = new MyData<>("Rifqi");
        // exampleInvariant(stringMyData); // ERROR
        // MyData<Object> objectMyData = stringMyData; // ERROR

        // PARENT to CHILD (Object to Integer)
        MyData<Object> objectMyData = new MyData<>(1999);
        // MyData<Integer> integerMyData = objectMyData; // ERROR
        // exampleInvariantInteger(objectMyData); // ERROR
    }

    public static void exampleInvariant(MyData<Object> objectMyData) {
        //example
    }

    public static void exampleInvariantInteger(MyData<Integer> objectMyData) {
        //example
    }
}
