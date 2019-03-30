package first.one.strange.test;

import java.util.ArrayList;

public class Question13and14 {

    static interface Mamm {}
    static class Furr implements Mamm { }
    static class Chip extends Furr {}

    public static void main(String[] args) {
        Chip c = new Chip();
        Mamm m = c;
        Furr f = c;
        if (c instanceof Mamm) System.out.println(1);
        if (c instanceof Chip) System.out.println(2);
        if (c instanceof Furr) System.out.println(3);
        if (null instanceof Furr) System.out.println(4);
    }

/*    static class Chip {}

    public static void main(String[] args) {
        ArrayList<Chip> list = new ArrayList<>();
        if (list instanceof Object) System.out.println("object!");
//        if (list instanceof Chip) System.out.println("object!");
//        doesn't compile!
    }*/
}
