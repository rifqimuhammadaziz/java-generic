package application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(23);
        NumberData<Long> longNumberData = new NumberData<>(1000L);

        // Cannot using String (class NumberData can only use child from Number)
        // NumberData<String> stringNumberData = new NumberData<String>("Xenosty");
    }

    // Only child from Number can be used (Integer, Float, Double...)
    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }


}
