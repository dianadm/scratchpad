package first.one;

public class MemberClass {

    private String name = "outer";

    protected class Inner {

        public void printName() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        MemberClass memberClass = new MemberClass();
        Inner inner = memberClass.new Inner();
        inner.printName();
    }
}
