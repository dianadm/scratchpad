package threads.step.four;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduling {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.schedule(() -> System.out.println("1"), 10, TimeUnit.SECONDS);
        service.schedule(() -> System.out.println("2"), 5, TimeUnit.SECONDS);

    }
}
