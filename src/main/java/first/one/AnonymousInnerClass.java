package first.one;

public class AnonymousInnerClass {

    abstract class NoName {
        abstract String getName();
    }

    public void printNames() {
        NoName noName = new NoName() {
            @Override
            String getName() {
                return "My name is !";
            }
        };
        System.out.println(noName.getName());
    }
}
