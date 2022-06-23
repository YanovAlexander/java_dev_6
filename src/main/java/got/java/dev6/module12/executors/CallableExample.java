package got.java.dev6.module12.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            Thread.sleep(4000);
            return "Hello world!" + Thread.currentThread().getName();
        };

        FutureTask<String> task = new FutureTask<>(callable);

        new Thread(task).start();

        new Thread(() -> {
            while (!task.isDone()) {
                System.out.println("Task in progress... by second thread waiting for result");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String hello = null;
            try {
                hello = task.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            System.out.println(hello);
        }).start();


        System.out.println("Main do some work");
    }
}
