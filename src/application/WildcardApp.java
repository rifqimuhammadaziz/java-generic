package application;

import generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1000));
        print(new MyData<String>("Xenosty"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    /**
     * Wildcard <?> : unknown parameter type (acceptable all type data)
     * @param myData
     */
    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
