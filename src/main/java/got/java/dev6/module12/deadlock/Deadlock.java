package got.java.dev6.module12.deadlock;

public class Deadlock {
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public void startDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (monitor1) {
                System.out.println("Monitor1 locked " + Thread.currentThread().getName());
                synchronized (monitor2) {
                    System.out.println("Monitor 2 locked" + Thread.currentThread().getName());
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (monitor2) {
                System.out.println("Monitor2 locked " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (monitor1) {
                    System.out.println("Monitor 1 locked" + Thread.currentThread().getName());
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
