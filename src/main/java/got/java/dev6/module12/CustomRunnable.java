package got.java.dev6.module12;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from runnable " + Thread.currentThread().getName());
    }
}
