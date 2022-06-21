package got.java.dev6.module12;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is custom thread " + Thread.currentThread().getName());
    }
}
