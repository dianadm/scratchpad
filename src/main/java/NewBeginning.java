import java.util.Arrays;
import java.util.List;

public class NewBeginning {

    public enum Test {
        Test("Teścik"),
        NoOne("Znowu nie pamiętam");

        String name;

        Test(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("hello: " + name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Siemanko!");

        Test.valueOf("NoOne").sayHello();
        List<Test> tests = Arrays.asList(Test.Test, Test.NoOne);

        Test test = null;
        if (tests.contains(test)) {
            System.out.println("blabla");
        }
    }
}
