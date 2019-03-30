package threads.step.one;

public class PrintingTest {

    public static void main(String[] args) {
        (new Thread(new PrintDataRun())).start();
        (new PrintDataThread()).start();
        (new Thread(() -> System.out.println("hello"))).start();
    }
}
