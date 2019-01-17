package first.one;

public class LocalInnerClass {

    public String name = "local";

    public void printEverything() {
        class Inner {
            String name = "inner";
            public void printHey() {
                System.out.println("inner! " + name);
            }
        }
        Inner inner = new Inner();
        inner.printHey();
    }

    public static void main(String[] args) {
        LocalInnerClass innerClass = new LocalInnerClass();
        innerClass.printEverything();
    }
}
