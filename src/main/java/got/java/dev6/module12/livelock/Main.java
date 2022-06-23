package got.java.dev6.module12.livelock;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker 1", true );
        Worker worker2 = new Worker("Worker 2", true );

        CommonResource resource = new CommonResource(worker1);
        Work work = new Work();

        new Thread(() -> work.work(resource, worker2, worker1)).start();
        new Thread(() -> work.work(resource, worker1, worker2)).start();
    }
}
