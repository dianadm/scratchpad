package threads.step.two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutors {

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            executorService.execute(() -> System.out.println("1."));
            executorService.execute(() -> System.out.println("2."));
            executorService.execute(() -> System.out.println("end"));
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
