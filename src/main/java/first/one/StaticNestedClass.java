package first.one;

public class StaticNestedClass {

    static class Nested {
        private int num = 3;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.num);
    }
}
