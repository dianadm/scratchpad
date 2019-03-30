package threads.synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizationTests {

    int counter = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.println(++counter);
        }
    }

    private synchronized void incrementAndReport2() {
        System.out.println(++counter);
    }

    public static void main(String[] args) {
        SynchronizationTests st = new SynchronizationTests();
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(10);
            for(int i = 0; i<10; i++) {
                service.submit(() -> st.incrementAndReport2());
            }

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
