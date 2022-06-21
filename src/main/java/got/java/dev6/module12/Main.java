package got.java.dev6.module12;

public class Main {
    private static volatile int counterNumber = 0;

    public static void main(String[] args){
        CounterObject counterObject = new CounterObject();
        counterObject.setCounter(0);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                Counter counter = new Counter();
                System.out.println("Thread started: " + Thread.currentThread().getName());
                counter.increment(counterObject);
                System.out.println(Thread.currentThread().getName() + " count: " + counterObject.getCounter());
            });
            thread.start();
        }
    }
}
