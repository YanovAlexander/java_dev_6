package got.java.dev6.module8.interfaces;

public interface Swimable {
    void swim();

    default void defaultFly() {
        System.out.println("flyable defaultFly");
    }
}
