package threads.step.four;

import java.util.concurrent.*;

public class WaitingFor {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future result = service.submit(() -> System.out.println("hey future!"));
        } finally {
            if (service != null) {
                service.awaitTermination(1, TimeUnit.MINUTES);
                if (service.isTerminated())
                    System.out.println("ok");
                else
                    System.out.println("not");
            }
        }
    }
}
