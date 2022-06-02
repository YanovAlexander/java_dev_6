package got.java.dev6.mothod9;


public class Formatter<D, M> {
    private D developer;
    private M manager;

    public void setDeveloper(D developer) {
        this.developer = developer;
    }

    public void setManager(M manager) {
        this.manager = manager;
    }

    public D getDeveloper() {
        return developer;
    }

    public M getManager() {
        return manager;
    }
}
