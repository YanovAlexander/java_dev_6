package got.java.dev6.module12.executors;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExecutorsDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);

        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                int i = new Random().nextInt();
                System.out.println(i);
                Thread.sleep(3000);
                return i;
            }
        };

//        List<Callable<Integer>> array = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Callable<Integer> callable = new Callable<Integer>() {
//                public Integer call() throws Exception {
//                    return new Random().nextInt();
//                }
//            };
//            array.add(callable);
//        } // before java 8

        List<Callable<Integer>> collect = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> callable)
                .collect(Collectors.toList());

//        service.invokeAll(collect);

        service.shutdown();

        //Cached executor service
        ExecutorService cachedService = Executors.newCachedThreadPool();

        cachedService.invokeAll(collect);
        cachedService.shutdown();
    }
}
