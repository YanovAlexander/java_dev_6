package got.java.dev6.module12;

public class Counter {

    public void increment(CounterObject counter) {
        synchronized (Counter.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            Integer counter1 = counter.getCounter();
            counter1++;
            counter.setCounter(counter1);
        }
    }

//    public int getCounter() {
//        return counter;
//    }
}
