package got.java.dev6.mothod9;

public interface Repository<D, M> {

    void save(D key, M value);

    D getKey();

    M getValue();
}
