package first.one;

public class AnonymousInnerClass {

    String name = "outerClass";

    abstract class NoName {
        String name = "";
        abstract String getName();
    }

    public void printNames() {
        NoName noName = new NoName() {
            @Override
            String getName() {
                return "My name is ! " + name;
            }
        };
        System.out.println(noName.getName());
    }

    public static void main(String[] args) {
        AnonymousInnerClass innerClass = new AnonymousInnerClass();
        innerClass.printNames();
    }
}
