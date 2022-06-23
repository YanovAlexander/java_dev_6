package got.java.dev6.module12.livelock;

public class CommonResource {
    private Worker worker;

    public CommonResource(Worker worker) {
        this.worker = worker;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
