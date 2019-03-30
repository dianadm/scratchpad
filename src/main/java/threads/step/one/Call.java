package threads.step.one;

import java.util.concurrent.Callable;

public class Call implements Callable {

    @Override
    public Object call() throws Exception {
        return 100;
    }
}
