package first.one;

public class StaticNestedClass {

    private static class Nested {
        private int num = 3;
        private void printNum() {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Nested tested = new StaticNestedClass.Nested();
        tested.printNum();
        Nested nested = new Nested();
        System.out.println(nested.num);
    }
}
