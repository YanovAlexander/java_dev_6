package got.java.dev6.mothod9;

public class DeveloperManagerRepository implements Repository<Developer, Manager>{

    private Developer developer;
    private Manager manager;

    @Override
    public void save(Developer developer, Manager manager) {
        this.developer = developer;
        this.manager = manager;
    }

    @Override
    public Developer getKey() {
        return developer;
    }

    @Override
    public Manager getValue() {
        return manager;
    }
}
