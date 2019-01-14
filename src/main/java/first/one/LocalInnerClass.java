package first.one;

public class LocalInnerClass {

    public void printEverything() {

        class Inner {
            public void printHey() {
                System.out.println("inner!");
            }
        }
        Inner inner = new Inner();
        inner.printHey();
    }
}
