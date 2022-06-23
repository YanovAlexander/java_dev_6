package got.java.dev6.module12.executors;

import java.util.concurrent.*;

public class CallableWithTimeout {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> callable = () -> {
//            Thread.sleep(300); // work correct
            Thread.sleep(3000); //fail with timeout
            return "String";
        };

        FutureTask<String> task = new FutureTask<>(callable);

        new Thread(task).start();

        String s = task.get(1, TimeUnit.SECONDS);
        System.out.println(s);
    }
}
